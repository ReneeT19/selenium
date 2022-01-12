import java.io.File;

public class Basics1 {

	public static void main(String[] args) {
		
	//Simple code to execute here
//	System.out.print("Hi");
//	int a = 2;
//	int b = 3;
//	int sum = a + b;
//	System.out.print("The sum is: " + sum + "\n");
//	
//	//Class and object - execute here by calling methods in a different class
//	Basics2 b2 = new Basics2();
//	b2.ValidateHeader();  //classobject.methodname; no need to print as it's printed in the method
//	System.out.print(b2.ValidateHeader2()); //need to print to see the return value
	
	//rename PDF

	File file = new File("C:\\Users\\Renee\\Documents\\git\\leetcode\\test.txt");

	// Create an object of the File class
	// Replace the file path with path of the directory
	File rename = new File("C:\\Users\\Renee\\Documents\\git\\leetcode\\renamePDF.txt");

	// store the return value of renameTo() method in
	// flag
	boolean flag = file.renameTo(rename);

	// if renameTo() return true then if block is
	// executed
	if (flag == true) {
		System.out.println("File Successfully Rename");
	}
	// if renameTo() return false then else block is
	// executed
	else {
		System.out.println("Operation Failed");
	}
	}
}
