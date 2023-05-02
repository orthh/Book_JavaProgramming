package chap08_IO;

import java.io.FileOutputStream;

public class FileOS {

	public static void main(String[] args) {
		
		byte b[] = {7,51,3,4,-1,24};
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\SMHRD\\Desktop\\test1231.out");
			fout.write(b);
//			for(int i=0; i<b.length; i++) {
//				fout.write(b[i]);
//			}
			fout.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
