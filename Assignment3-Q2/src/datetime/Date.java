package datetime;
import javax.swing.JOptionPane;
public class Date 
{
private
int day, month,year;
public Date()
{
	day=0;
	month=0;
	year=0;
}
 public Date(int d,int m,int y)
{
	day=d;
	month=m;
	year=y;
}
 public void setday(int d)
{
	day=d;
}
 public void setmonth(int m)
{
	month=m;
}
 public void setyear(int y)
{
	year=y;
}
 public int getday()
{
	return day;
}
 public int getmonth()
{
	return month;
}
 public int getyear()
{
	return year;
}
public void inputdate()
{
	String day=JOptionPane.showInputDialog("enter day: ");
	String month=JOptionPane.showInputDialog("enter month: ");
	String year=JOptionPane.showInputDialog("enter year: ");
	int d=Integer.parseInt(day);
	int m=Integer.parseInt(month);
	int y=Integer.parseInt(year);
}
 public String toString()
{
	return day+"/"+month+"/"+year;
}
}
