package p1001;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {

		OutputStream os= new FileOutputStream("c:/Temp/test.txt");
		byte[] data = "ABV".getBytes();
		for(int i=0; i<data.length;i++) {
			os.write(data[i]);
			System.out.println(data[i]);
		}
		os.flush();
		os.close();
	}

}
