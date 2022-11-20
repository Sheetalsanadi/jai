package StringBuilder;

public class S4 {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("HELLO");
		StringBuilder s2=s1;
		System.out.println("before append");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println(s2==s2);
		s2.append("abc");
		System.out.println("after append");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println(s2==s2);

	}

}
