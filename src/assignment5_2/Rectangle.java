package assignment5_2;

public class Rectangle extends Figure {
	//Declaring other dimension for Rectangle, one dimension will be inherited from Figure the parent class
	double dim2;
	
	//constrcutor of rectangle
	
  public Rectangle(double dim1,double dim2){
	  this.dim1=dim1;
	  this.dim2=dim2;
  } 
	@Override
	void findArea() {
		//calculating area of the rectangle
		double area=dim1*dim2;
		//printing area of the rectangle
		System.out.println("Area of the rectangle is "+area);

	}

	@Override
	void findPerimeter() {
		//calculating Perimeter
	double perimeter=2*(dim1+dim2);
	//printing perimeter
	System.out.println("Perimeter of the rectangel is "+perimeter);

	}

}
