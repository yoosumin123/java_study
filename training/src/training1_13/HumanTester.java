package training1_13;

public class HumanTester {

	public static void main(String[] args) {
		Human gindong = new Human("길동", 170, 60);
		Human chulsu = new Human("철수", 166, 72);
		
		gindong.gianWeight(3);
		chulsu.reduceWeight(5);
		
		System.out.println("이름:" + gindong.getName());
		System.out.println("신장:" + gindong.getHeight() + "cm");
		System.out.println("체중:" + gindong.getWeight() + "kg");
		System.out.println();
		
		System.out.println("이름:" + gindong.getName());
		System.out.println("신장:" + gindong.getHeight() + "cm");
		System.out.println("체중:" + gindong.getWeight() + "kg");
		
	}

}
