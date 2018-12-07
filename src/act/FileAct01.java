package act;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import lombok.val;

import static ot.utils.Basic.*;

public class FileAct01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		val path = "postgres/memo.txt";
		val path = "test1/test2/test4//test5/test3.txt";		
		val p = path.lastIndexOf('/');
		
		out(p);
		out(path.substring(0, p));
		
		val dir = path.substring(0,p);
		out(dir);
		
		try {
			if(!Files.exists(Paths.get(path))){
				Files.createDirectories(Paths.get(dir));
				Files.createFile(Paths.get(path));
			}
		}catch(Exception e) {
			out(e);
		}
	}

}
