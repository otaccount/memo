package fs;

// import static ot.utils.Basic.*;
import static ot.utils.Basic.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import lombok.val;

public class FileUtils {
	/**
	 * ディレクトリ作成
	 * 
	 * @param path
	 */
	public static void fileMake(String path) {
		File file = new File(path);
		file.mkdir();
	}
	
	// 
	/**
	 * ディレクトリ作成２(すでに存在する場合は エラー スロー)
	 * 
	 * @param path
	 * @throws IOException
	 */
	public static void filesMake(String path) throws IOException{
		Files.createDirectory(Paths.get(path));
	}
	
	/**
	 * 途中のディレクトリも作成する
	 * 
	 * @param path
	 * @throws IOException
	 */
	public static void filesMakes(String path) throws IOException{
		Files.createDirectories(Paths.get(path));
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			val path = "test1/test2/test3";
			fileMake(path);
		}catch(Exception e) {
			out(e);
		}
	}
}
