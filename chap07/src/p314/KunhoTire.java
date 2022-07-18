package p314;

public class KunhoTire extends Tire{
    //필드
	//생성자
	public KunhoTire(String location, int maxRotation ) {
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + " KunhoTire 수명: " + 
		     (maxRotation-accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "KunhoTire 펑크 ***");
			return false;
		}
	}
}
