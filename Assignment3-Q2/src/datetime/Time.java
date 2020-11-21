
package datetime;

import javax.swing.JOptionPane;

public class Time 
{
	private
	int hour, minute;
	public
	Time()
	{
		hour=0;
		minute=0;
	}
	Time(int h,int m)
	{
		hour=h;
		minute=m;
	}
	void sethour(int h)
	{
		hour=h;
	}
	int gethour()
	{
		return hour;
	}
	void setminute(int m)
	{
		minute=m;
	}
	int getminute()
	{
		return minute;
	}
	 public void inputtime()
	{
		String hour=JOptionPane.showInputDialog("enter hour: ");
		String minute=JOptionPane.showInputDialog("enter minute: ");
		int h=Integer.parseInt(hour);
		int m=Integer.parseInt(minute);
	}
	public String toString()
	{
		return +hour+":"+minute;
	}
}
