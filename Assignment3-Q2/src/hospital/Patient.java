package hospital;

import javax.swing.JOptionPane;

public class Patient
{
public
String name, address;
char gender;
int  cnic,age, phoneno;
public
Patient()
{
	name=" ";
	address=" ";
	gender=' ';
	cnic=0;
	age=0;
	phoneno=0;
}
Patient(String n, String addr,char g, int c,int a, int ph)
{
	name=n;
	address=addr;
	gender=g;
	cnic=c;
	age=a;
	phoneno=ph;
}
void setname(String n)
{
	name=n;
}
String getname()
{
	return name;
}
void setaddress(String addr)
{
	address=addr;
}
String getaddress()
{
	return address;
}
void setgender(char g)
{
	gender=g;
}
char getgender()
{
	return gender;
}
void setcnic(int c)
{
	cnic=c;
}
int getcnic()
{
	return cnic;
}
void setage(int a)
{
	age=a;
}
int getage()
{
	return age;
}
void setphone(int ph)
{
	phoneno=ph;
}
int getphone()
{
	return phoneno;
}
void inputpat()
{
	String name=JOptionPane.showInputDialog("enter name of Indoor patient: ");
	String addr=JOptionPane.showInputDialog("enter address of Indoor patient: ");
	String gender=JOptionPane.showInputDialog("enter gender of Indoor patient: ");
	String cnic=JOptionPane.showInputDialog("enter cnic of Indoor patient: ");
	String age=JOptionPane.showInputDialog("enter age of Indoor patient: ");
	String phoneNo=JOptionPane.showInputDialog("enter phone number  of Indoor patient: ");
	Integer.parseInt(name);
	Integer.parseInt(addr);
	int patgender=Integer.parseInt(gender);
	int patcnic=Integer.parseInt(cnic);
	int patage=Integer.parseInt(age);
	int patphoneNo=Integer.parseInt(phoneNo);
}
void displaypat()
{
	System.out.println(" name of indoor patien: "+name);
	System.out.println(" address of indoor patient: "+address);
	System.out.println(" gender of indoor patient: "+gender);
	System.out.println(" cnic of indoor patient: "+cnic);
	System.out.println(" age of indoor patient: "+age);
	System.out.println(" phoneNo of indoorpatient: "+phoneno);
}
}
