
public class Square extends Rectangle
{
	private
	double side;
	public
	Square()
	{
		side=0.00;
	}
Square(double s)
{
		side=s;
}
Square(double l, double w, double s)
{
	length=l;
	width=w;
	side=s;
}
void setside(double s)
{
	side=s;
}
double getside()
{
	return side;
}
void setwidth(double s)
{
	width=s;
}
void setlength(double s)
{
	length=s;
}
double getarea()
{
	return side*side;
}
double getperimeter()
{
	return 4*side;
}
public String toString()
{
	return "A square with side= "+side+"which is a subclass of rectangle where  "+super.toString();
}
}
