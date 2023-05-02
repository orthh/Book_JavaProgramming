package chap08_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileR {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("C:\\Users\\SMHRD\\Desktop\\공모전.txt");
//		try {
//			int c;
//			while((c = fr.read()) != -1){
//				System.out.println((char)c);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		char[] buf = new char[1024];
		try {
			int n = fr.read(buf);
			System.out.println(n);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
