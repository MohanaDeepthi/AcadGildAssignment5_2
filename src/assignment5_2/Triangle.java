package assignment5_2;


public class Triangle extends Figure {
	
	double dim2,dim3;
	
	//Triangle constructor
	public Triangle(double dim1,double dim2,double dim3){
		this.dim1=dim1;
		this.dim2=dim2;
		this.dim3=dim3;
	}
	
	//Area of the triangle 
	@Override
	void findArea() {
		//Calculating area of the triangle
		double area=(dim1*dim2)/2;
		//printing area of the triangle
		System.out.println("Area of Triangle "+area);

	}
	//Perimeter of the triangle
	@Override
	void findPerimeter() {
		//Calculating perimeter of the triangle
		double perimeter=dim1+dim2+dim3;
		System.out.println("Perimeter of the triangle "+perimeter);
		
	

	}

}
