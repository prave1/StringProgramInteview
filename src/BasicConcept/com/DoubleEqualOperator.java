package BasicConcept.com;

public class DoubleEqualOperator {
	
	public static void main(String[] args) {
		String s1=new String("rattaiah");
		String s2=new String("duragsoft");
		String s3=new String("rattaiah");
		String s4=s1;
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1==s4);
	}

}
