package p996;
// 파일 읽어오기 한글자단위로
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		InputStream is= new FileInputStream("C:/Temp/test.txt"); //파일 열었으면
		int readByte;
		while(true) { 
			readByte = is.read();
			if(readByte == -1) break;
			System.out.print((char)readByte);
		
		}
is.close(); // 파일 닫아야한다
	}

}
