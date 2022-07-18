package p996;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/Temp/test. txt");
		int readByteNo;
		byte[]readBytes = new byte[8];
		readByteNo = is.read(readBytes, 1, 2);
		for (int i=0; i<readBytes.length; i++) {
			System.out.println((char)readBytes[i]);
		}
		is.close();
	}

}
