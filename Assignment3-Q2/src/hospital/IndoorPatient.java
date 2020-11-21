package hospital;
import datetime.Date;
import javax.swing.JOptionPane;
public class IndoorPatient extends Patient
{
private
int wardNo, roomNo, bedNo,fee;
Doctor doc=new Doctor();
Date d = new Date(); 
public
IndoorPatient()
{
	wardNo=0;
	roomNo=0;
	bedNo=0;
	fee=0;
}
IndoorPatient(String n, String addr,char g, int c,int a, int ph,int wN, int rN, int bN,int f )
{
	name=n;
	address=addr;
	gender=g;
	cnic=c;
	age=a;
	phoneno=ph;
	wardNo=wN;
	roomNo=rN;
	bedNo=bN;
	fee=f;
}
void setwardNo(int wN)
{
	wardNo=wN;
}
int getwardNo()
{
	return wardNo;
}
void setroomNo(int rN)
{
	roomNo=rN;
}
int getroomNo()
{
	return roomNo;
}
void setbedNo(int bN)
{
	bedNo=bN;
}
int getbedNo()
{
	return bedNo;
}
void setfee(int f)
{
	fee=f;
}
int getfee()
{
	return fee;
}
void addindoorpat()
{
	for(int i=0;)
	super.inputpat();
	String wardNo=JOptionPane.showInputDialog("enter ward number: ");
	String roomNo=JOptionPane.showInputDialog("enter room number: ");
	String bedNo=JOptionPane.showInputDialog("enter bed number: ");
	String fee=JOptionPane.showInputDialog("enter fee: ");
	String dofappoin=JOptionPane.showInputDialog("enter date of admission of indoor patient: ");
	int wardnum=Integer.parseInt(wardNo);
	int roomnum=Integer.parseInt(roomNo);
	int bednum=Integer.parseInt(bedNo);
	int patfee=Integer.parseInt(fee);
	d.inputdate();
}
void displayindoorpat()
{
		super.displaypat();
		System.out.println(" wardNo of indoorpatient: "+wardNo);
		System.out.println(" roomNo of indoorpatient: "+roomNo);
		System.out.println(" bedNo of indoorpatient: "+bedNo);
		System.out.println(" fee of indoorpatient: "+fee);
}
}
