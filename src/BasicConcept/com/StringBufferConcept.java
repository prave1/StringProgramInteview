package BasicConcept.com;

public class StringBufferConcept {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//default capacity 16
		StringBuffer sb1=new StringBuffer(5);
		System.out.println(sb1.capacity());//your provided capacity 
		StringBuffer sb2=new StringBuffer("rattaiah");
		System.out.println(sb2.capacity());// initial capacity+provided string length 24
		System.out.println(sb2.length()); //8
	}

}
