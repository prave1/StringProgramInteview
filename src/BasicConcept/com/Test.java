package BasicConcept.com;

public class Test {
	public static void main(String[] args) {
		
		Test t1=new Test();
		Test t2=t1;
		Test t3=new Test();
		System.out.println(t1.equals(t2));//true
		System.out.println(t1.equals(t3));//false
		String str1="ratan";
		String str2="ratan";
		System.out.println(str1.equals(str2));   //true
		StringBuffer sb1=new StringBuffer("durga");
		StringBuffer sb2=new StringBuffer("durga");
		StringBuffer sb3=sb2;
		System.out.println(sb1.equals(sb2));    //flase
		System.out.println(sb2.equals(sb3));    //true
	}
	
}
