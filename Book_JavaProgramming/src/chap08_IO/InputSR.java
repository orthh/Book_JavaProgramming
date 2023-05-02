package chap08_IO;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputSR {

	public static void main(String[] args) {
		
		InputStreamReader rd = new InputStreamReader(System.in);
		int c = 0;
		try {
			c = rd.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(c);
	}

}
