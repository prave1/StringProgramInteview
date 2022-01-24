package BasicConcept.com;

public class GetBytesMethod {
	
	public static void main(String[] args) {
		
		String str="Praveen";
		byte[] b=str.getBytes();
		
		System.out.println("The Print the getBytesMethod="+b);
		String str1=new String(b);
		System.out.println(str1);
	}

}
