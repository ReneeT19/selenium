
public class Basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Simple code to execute here
	System.out.print("Hi");
	int a = 2;
	int b = 3;
	int sum = a + b;
	System.out.print("The sum is: " + sum + "\n");
	
	//Class and object - execute here by calling methods in a different class
	Basics2 b2 = new Basics2();
	b2.ValidateHeader();  //classobject.methodname; no need to print as it's printed in the method
	System.out.print(b2.ValidateHeader2()); //need to print to see the return value
	
	}
}
