package p662;

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey()) ;
		boolean valueCompare = p1.getvlaue().equals(p2.getvlaue()) ;
		return keyCompare && valueCompare;
		
	}
}
