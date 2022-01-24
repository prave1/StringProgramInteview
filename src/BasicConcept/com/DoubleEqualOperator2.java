package BasicConcept.com;

public class DoubleEqualOperator2 {
	
	DoubleEqualOperator2(int i)
	{
		System.out.println("0 arg cons");
		System.out.println(i);
	}
	
  public static void main(String[] args) {
	
	  DoubleEqualOperator2 t1=new DoubleEqualOperator2(10);
	  DoubleEqualOperator2 t2=new DoubleEqualOperator2(20);
	  DoubleEqualOperator2 t3=new DoubleEqualOperator2(30);
	  DoubleEqualOperator2 t4=t1;
	  
	  System.out.println(t1==t2);//false
	  System.out.println(t2==t3);//false
	  System.out.println(t3==t1);//false
	  System.out.println(t1==t4);//true
}
}
