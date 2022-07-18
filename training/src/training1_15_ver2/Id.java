package training1_15_ver2;
//일련 번호 클래스 (Ver.2)
public class Id {
	private static 	int counter = 0;
	private int id;
	
	public Id() {
		id = ++counter;
	}
	
	public int getId() {return id;}
	
	public static int getMaxId() {
		return counter;
	}
}
