package p1004;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("c:/Temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[4];
		String data = "";
		readCharNo = reader.read(cbuf, 1,2);
		for(int i=0; i<cbuf.length; i++) {
			System.out.println(cbuf[i]);
		
		
		}
		
		reader.close();
	}

}
