package act;

import static ot.utils.Basic.*;
import static java.util.Calendar.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.StringJoiner;

import lombok.val;

public class MemoMake {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		val cal = Calendar.getInstance();
		
		val sb = new StringJoiner("/");
		sb.add("memo");
		sb.add(String.valueOf(cal.get(YEAR)));
		sb.add(String.valueOf(cal.get(MONTH) + 1));
//		val sb = new StringBuilder();
//		sb.append("memotmp/test");
		
		val text = String.valueOf(cal.get(DATE)) + "_memo.txt";
		out(sb.toString());
		
		try {
			Files.createDirectories(Paths.get(sb.toString()));
			Files.createFile(Paths.get(sb.toString() + "/" + text));
		}catch(Exception e) {
			out(e);
		}
	}

}
