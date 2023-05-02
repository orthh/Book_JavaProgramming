package chap08_IO;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputSR2 {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("C:\\Users\\SMHRD\\Desktop\\공모전.txt");
			in = new InputStreamReader(fin, "UTF-8");
			
			int c;
			
			System.out.println("인코딩 문자 집합은 : " + in.getEncoding());
			while((c = in.read()) != -1) {
				System.out.println((char)c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
