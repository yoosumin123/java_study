package training1_15;
//일련 번호 클래스 (Ver.1)
public class Id {
	static int counter = 0;
	private int id;
	
	public Id() {
		id = ++counter;
	}
	
	public int getId() {
		return id;
	
	}

}
