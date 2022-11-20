package StringBuilder;

public class S1 {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder();
		System.out.println(s1.capacity());
		s1.append("abcdefghijklmno");
		System.out.println(s1.capacity());
		s1.append("q");
		System.out.println(s1.capacity());
		s1.append("rstuvwxyz1234567890");
		System.out.println(s1.capacity());
	}

}
