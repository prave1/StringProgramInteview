package BasicConcept.com;

public class BooleanIgnoreCase {
	
	public static void main(String[] args) {
		
		String str1="ratan";
		String str2="durga";
		String str3="ratan";
		String str4="Durga";
		
		System.out.println(str1.equalsIgnoreCase(str2));  //false
		System.out.println(str1.equalsIgnoreCase(str4));  //false
		System.out.println(str2.equals(str4));           //false
		System.out.println(str2.equalsIgnoreCase(str4));  //true
	}

}
