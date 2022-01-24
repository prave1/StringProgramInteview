package BasicConcept.com;

public class CompareToString {
	public static void main(String... ratan)
	{
	String str1="ratan";
	String str2="durga";
	String str3="ratan";
	String str4="Durga";
	String str5="ratna";
	
	System.out.println(str1.compareTo(str2));//14
	
	System.out.println(str1.compareTo(str4));//46
	
	System.out.println(str2.compareTo(str4));//32
	
	System.out.println(str4.compareTo(str2));//-32
	System.out.println(str1.compareTo(str3));//0
	System.out.println(str1.compareTo(str5));//-13
	System.out.println(str1.compareToIgnoreCase(str5));//-13
	System.out.println(str2.compareToIgnoreCase(str4));//0
	System.out.println(str1.compareToIgnoreCase(str3));//0

	}
	

}
