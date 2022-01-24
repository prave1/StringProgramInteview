package BasicConcept.com;

public class TrimMethod {
	public static void main(String[] args) {
		
		String str=" ratan ";
		System.out.println(str.length()); //7
		System.out.println(str.trim()); //ratan
		System.out.println(str.trim().length());//5
		System.out.println(" ratan ".trim());//ratan
	}

}
