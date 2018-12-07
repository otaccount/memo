package act;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static ot.utils.Basic.*;
public class FileAct02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Files.copy(Paths.get("postgres"),Paths.get("postgres_bkup"), StandardCopyOption.REPLACE_EXISTING);
		}catch(Exception e) {
			out(e);
		}
	}

}
