package BasicConcept.com;

public class EqualsMethod1 {
	
	
	public static void main(String[] args) 
	{
	String str1="ratan";
	String str2="durga";
	String str3="Ratan";
	
	System.out.println(str1.equalsIgnoreCase(str2));//false
	System.out.println(str1.equalsIgnoreCase(str3));//true
	System.out.println("durga".equalsIgnoreCase(str2));//true
	System.out.println("SOFT".equalsIgnoreCase("soft"));//true
	System.out.println("soft".equalsIgnoreCase("soft"));//true
	}

}
