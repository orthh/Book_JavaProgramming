package chap08_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileIS {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\SMHRD\\Desktop\\test1231.txt");
			
			byte[] b = new byte[6];
			int n=0, c;
//			while((c=fin.read()) != -1) {
//				b[n] = (byte)c;
//				n++;
//			}
			fin.read(b);
			for(int i=0; i<b.length; i++) {
				System.out.println(b[i] + " ");
			}
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
