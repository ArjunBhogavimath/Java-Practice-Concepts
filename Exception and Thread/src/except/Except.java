package except;

public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		try{
			check(10,38);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("final");

	}
   static void check(int age,int weight) throws ArithmeticException {
	   if(age<12 && weight<40) {
		   throw new ArithmeticException("Student is not");
		   
	   }
	   else {
		   System.out.println("valid");
	   }
   }
}
