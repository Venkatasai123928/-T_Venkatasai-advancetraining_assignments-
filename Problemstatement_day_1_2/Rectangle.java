import java.util.Scanner;


public class Rectangle {
		
	    int length; 
	    int breadth; 
	    int area; 
	   
	    public Rectangle()
	    {
	    	length = 0;
	    	breadth= 0;
	    }

	    void input() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter length of rectangle: ");
	        length = in.nextInt();
	        System.out.print("Enter breadth of rectangle: ");
	        breadth = in.nextInt();
	    }

	    void calculate() {
	        area = length * breadth;
	        
	    }

	    void display() {
	        System.out.println("Area of Rectangle = " + area);
	       
	    }

	    public static void main(String args[]) {
	        Rectangle obj1 = new Rectangle();
	        obj1.input();
	        obj1.calculate();
	        obj1.display();
	        System.out.println("****************************");
	        Rectangle obj2 = new Rectangle();
	        obj2.input();
	        obj2.calculate();
	        obj2.display();
	        System.out.println("****************************");
	        Rectangle obj3 = new Rectangle();
	        obj3.input();
	        obj3.calculate();
	        obj3.display();
	        System.out.println("****************************");
	        Rectangle obj4 = new Rectangle();
	        obj4.input();
	        obj4.calculate();
	        obj4.display();
	        System.out.println("****************************");
	        Rectangle obj5 = new Rectangle();
	        obj5.input();
	        obj5.calculate();
	        obj5.display();
	    }
	}


