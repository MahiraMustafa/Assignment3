package hospital;

import javax.swing.JOptionPane;

public class Doctor 
{
private 
String name, department, specialization;
char gender;
double  cnic, phoneno;
public
Doctor()
{
	name=" ";
	department=" ";
	specialization=" ";
	gender=' ';
	cnic=0;
	phoneno=0;
}
 public Doctor(String n, String d,String s, char g, double c, double ph)
{
	name=n;
	department=d;
	specialization=s;
	gender=g;
	cnic=c;
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
void setdepartment(String d)
{
	department=d;
}
String getdepartment()
{
	return department;
}
void setspecialization(String s)
{
	specialization=s;
}
String getspecialization()
{
	return specialization;
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
double getcnic()
{
	return cnic;
}
void setphone(int ph)
{
	phoneno=ph;
}
double getphone()
{
	return phoneno;
}
void displaydocinfo()
{
	System.out.println(" name of doctor: "+name);
	System.out.println(" department of doctor: "+department);
	System.out.println(" specialization of doctor: "+specialization);
	System.out.println(" gender of doctor: "+gender);
	System.out.println(" cnic of doctor: "+cnic);
	System.out.println(" phoneNo of doctor: "+phoneno);

}
}
