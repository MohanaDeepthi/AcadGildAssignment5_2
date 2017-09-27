//package name
package assignment5_2;
import java.util.*;
//Test class name
public class Assignment5_2 {
	//main method 
	public static void main(String args[]){
		//Declare Scanner Object
		Scanner s1=new Scanner(System.in);
		double dim1,dim2,dim3;
		
		System.out.println("Enter three dimensions");
		dim1=s1.nextDouble();
		dim2=s1.nextDouble();
		dim3=s1.nextDouble();
		//Instantiate Circle object
		Figure cirVar=new Circle(dim1);
		//calling findArea() and findPerimeter() with circle object	
		cirVar.findArea();
		cirVar.findPerimeter();
		//Instance of Rectangle object
		Figure rectVar=new Rectangle(dim1, dim2);
		//calling findArea() and findPerimeter() with rectangle object
		rectVar.findArea();
		rectVar.findPerimeter();
		//Instantiating Triangle Variable
		Figure triVar=new Triangle(dim1, dim2, dim3);
		//calling findArea() and findPerimeter() with Triangle Object
		triVar.findArea();
		triVar.findPerimeter();
	
		
		s1.close();
	}
	
	

}
