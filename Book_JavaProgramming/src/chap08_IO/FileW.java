package chap08_IO;

import java.io.FileWriter;
import java.util.Scanner;

public class FileW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("C:\\Users\\SMHRD\\Desktop\\test111.txt");
			while(true) {
				String line = sc.nextLine();
				if(line.length() == 0) {
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
