package p1020;public class FileWriterExample {

	public static void main(String[] args) {
		File file = new File(C:\\Temp\\test.txt");
		FileWriter fw = new FileWriter(test, true );
		fw.write("FileWriter는 한글로된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다. " + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
		
		

	}

}
