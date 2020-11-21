
public class Circle extends Shape 
{
private
double radius;
public
Circle()
{
	radius=1.0;
}
Circle(double r)
{
	radius=r;
}
Circle(double r, String c, boolean f)
{
	radius=r;
	color=c;
	filled=f;
}
void setradius(double r)
{
	radius=r;
}
double getradius()
{
	return radius;
}
double getarea()
{
	return 3.14*radius*radius;
}
double getperimeter()
{
	return 2*3.14*radius;
}
 public String toString()
{
	return "A circle with radius= "+radius+"which is a subclass of Shape where "+super.toString();
}
 
}
