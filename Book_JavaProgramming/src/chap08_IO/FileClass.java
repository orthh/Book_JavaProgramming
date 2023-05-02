package chap08_IO;

import java.io.File;

public class FileClass {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\SMHRD\\Desktop\\test1231.txt");
		
		long size = f.length();
		System.out.println(size); // 파일의 크기 리턴
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getParent());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.listFiles());
	}
	
}
