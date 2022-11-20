package StringBuilder;

public class S6 {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("HELLO");
		StringBuilder s2=new StringBuilder();
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2.append(s1.charAt(i));
		}
		System.out.println(s2);

	}

}
