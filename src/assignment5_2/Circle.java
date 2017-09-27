package assignment5_2;

public class Circle extends Figure {

	//implementation of findArea abstract method in child class
	//Area of circle is pi*r*r
	
	public Circle(double dim1){
		this.dim1=dim1;
	}
	
	
	@Override
	void findArea() {
		//calculating area of the circle
		double area=PI*dim1*dim1;
		//Printing area of the circle
		System.out.println("Area of the circle is "+area);
		

	}

	@Override
	//perimeter of the circle
	void findPerimeter() {
		//calculating Perimeter of the circle
		double perimeter = 2*PI*dim1;
		//Pinting perimeter of the circle
		System.out.println("Perimeter of the circle is "+perimeter);
		

	}

}
