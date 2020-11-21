
public class Rectangle extends Shape
{
public
double length;
double width;
public
Rectangle()
{
	length=1.0;
	width=1.0;
}
Rectangle(double l, double w)
{
	length=l;
	width=w;
}
Rectangle(double l, double w, String c, boolean f)
{
	length=l;
	width=w;
	color=c;
	filled=f;
}
void setlength(double l)
{
	length=l;
}
void setwidth(double w)
{
	width=w;
}
double getlength()
{
	return length;
}
double getwidth()
{
	return width;
}
double getarea()
{
	return length*width;
}
double getperimeter()
{
	return 2*(length+width);
}
public String toString()
{
	return "A rectangle with width= "+width+"and length= "+length+"which is a subclass of shape where "+super.toString();
}

}
