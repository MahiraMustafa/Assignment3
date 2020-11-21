
public class shapedemo {

	public static void main(String[] args)
	{
		Shape s=new	Shape("red", false);
		String a=s.getcolor();
		boolean b=s.isxxx();
		System.out.println(s.toString(a,b));
		Rectangle rec=new Rectangle(3,2, "blue",false);
		System.out.println(rec.toString());
		System.out.println("area of rectangle: "+rec.getarea());
		System.out.println("perimeter of rectangle: "+rec.getperimeter());
		Circle cir=new Circle(3.0,"green",true);
		System.out.println(cir.toString());
		System.out.println("area of circle: "+cir.getarea());
		System.out.println("perimeter of circle: "+cir.getperimeter());
		Square sqr=new Square(5,3,2);
		System.out.println(sqr.toString());
		System.out.println("area of square: "+sqr.getarea());
		System.out.println("perimeter of square: "+sqr.getperimeter());
	}

}
