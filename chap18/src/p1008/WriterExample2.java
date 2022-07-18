package p1008;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample2 {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("c:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();
		writer.write(data,1 ,2);									
		writer.flush();
		writer.close();
}
}