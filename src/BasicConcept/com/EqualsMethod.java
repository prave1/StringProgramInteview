package BasicConcept.com;

public class EqualsMethod {
	
	public static void main(String[] args) {
		
		EqualsMethod t1=new EqualsMethod();
		EqualsMethod t2=new EqualsMethod();
		EqualsMethod t3=t2;
		
     System.out.println(t1.equals(t2));//false
     System.out.println(t1.equals(t3));//false
     System.out.println(t3.equals(t2));//true
     
     
     String str1="ratan";
     String str2="durga";
     String str3="ratan";
     System.out.println(str1.equals(str2));  //false
     System.out.println(str1.equals(str3));    //true
     System.out.println("durga".equals(str2));   //true
     System.out.println("SOFT".equals("soft"));  //false
     System.out.println("soft".equals("soft"));  //true
	}

}
