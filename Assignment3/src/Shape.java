
public class Shape
{
public
String color;
boolean filled;
public
Shape()
{
	color="green";
	filled=true;
}
Shape(String c,boolean f)
{
	color=c;
	filled=f;
}
void setcolor(String c)
{
	color=c;
}
void setfilled(boolean f)
{
	filled=f;
}
String getcolor()
{
	return color;
}
boolean isxxx()
{
	return filled;
}
 public String toString(String c,boolean f)
{
	 if(filled==true)
	return "A shape with color of "+color+" is filled";
	 else
		 return "A shape with color of "+color+" is not filled";	 
}
 
}
