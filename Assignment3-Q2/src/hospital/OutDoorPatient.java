package hospital;
import datetime.Date;
import datetime.Time;
import javax.swing.JOptionPane;

public class OutDoorPatient extends Patient 
{
private
int dofappoin, tofappoin,fee;
Doctor doc=new Doctor();
Time t=new Time();
Date d= new Date();
public
OutDoorPatient()
{
	dofappoin=0;
	tofappoin=0;
	fee=0;
}
OutDoorPatient(String n, char g, int a, int doa,int toa,int f)
{
	name=n;
	gender=g;
	age=a;
	dofappoin=doa;
	tofappoin=toa;
	fee=f;
}
void setdofappoin(int doa)
{
	dofappoin=doa;
}
int getdofappoin()
{
	return dofappoin;
}
void settofappoin(int toa)
{
	tofappoin=toa;
}
int gettofappoin()
{
	return tofappoin;
}
void setfee(int f)
{
	fee=f;
}
int getfee()
{
	return fee;
}
void addoutdoorpat()
{
	super.inputpat();
	String name=JOptionPane.showInputDialog("enter name of outdoor patient: ");
	String gender=JOptionPane.showInputDialog("enter gender of outdoor patient: ");
	String age=JOptionPane.showInputDialog("enter age of Indoor patient: ");
	String dofappoin=JOptionPane.showInputDialog("enter date of appoinment of outdoor patient: ");
	String tofappoin=JOptionPane.showInputDialog("enter time of appoinment of outdoor patient: ");
	String fee=JOptionPane.showInputDialog("enter fee of appoinment of outdoor patient: ");
Integer.parseInt(name);
	int patgender=Integer.parseInt(gender);
	int patage=Integer.parseInt(age);
	d.inputdate();
	t.inputtime();
	int patfee=Integer.parseInt(fee);
}
 void inputappoindate()
 {
	 d.inputdate();
 }
 void inputappointime()
 {
	 t.inputtime();
 }

void displayappoinlist()
{
	
}
public int getday() {
	return dofappoin.getday();
}
public int getmonth() {
	return 0;
}
public int getyear() {
	return 0;
}
}