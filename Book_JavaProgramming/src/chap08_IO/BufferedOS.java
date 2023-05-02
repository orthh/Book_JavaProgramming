package chap08_IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedOS {

	public static void main(String[] args) {
		
		BufferedOutputStream bout = new BufferedOutputStream(System.out, 20);
		
		try {
			FileReader fin = new FileReader("C:\\Users\\SMHRD\\Desktop\\test1231.txt");
			int c;
			while((c=fin.read()) != -1) {
				bout.write((char)c);
			}
			bout.flush();
			bout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
