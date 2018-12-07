package test.fs;

import static org.assertj.core.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static fs.FileUtils.*;

import lombok.val;

class FileUtilsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		val path = "test1";
		fileMake(path);
		
		assertThat(Files.exists(Paths.get(path))).isTrue();
	}
	
	@Test
	void test2() throws Exception{
		val path = "test2/test3";
		filesMakes(path);
		
		assertThat(Files.exists(Paths.get(path))).isTrue();
	}

}
