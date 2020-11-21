package hospital;

import javax.swing.JOptionPane;

public class democlass 
{

	public static void main(String[] args) 
	{
		Doctor[] doc=new Doctor[3];
		doc[0]=  new Doctor("hina","skin","dermatology",'f', 1234,03105234 );
		doc[1]=  new Doctor("ali","ENT","ear",'m', 5678,03135221 );
		doc[2]=  new Doctor("ahmed","Heart","cardiology",'m', 9012, 0321456 );
		Patient[] p=new Patient[2];
		String input=JOptionPane.showInputDialog("which reference you want to make? indoor or outdoor? enter 1 for indoor and 2 for outdoor");
		int option=Integer.parseInt(input);
		if(option==1)
			p[0]=new IndoorPatient();
		else if(option==2)
		p[1]=new OutDoorPatient();
		else
			System.out.println("invalid input");
		int ch=0;
		do
		{
		System.out.println("          Menu       ");
		System.out.println("  Enter 1 for Add an indoor patient ");
		System.out.println("  Enter 2 for Add an outdoor patient ");
		System.out.println("  Enter 3 to see the list of all doctors ");
		System.out.println("  Enter 4 to Search a doctor by name or department ");
		System.out.println("  Enter 5 to See the list of all indoor patients ");
		System.out.println("  Enter 6 to See the list of all appointments on a certain day ");
		System.out.println("  Enter 7 to See the list of all appointments of a certain doctor ");
		System.out.println("  Enter 8 to change the date or time of appointment of a certain patient. ");
		switch(ch)
		{
		case 1: 
			{
				((IndoorPatient) p[0]).addindoorpat();
				break;
			}
		case 2:
		{
			((OutDoorPatient) p[1]).addoutdoorpat();
			break;
		}
		case 3:
		{
				for(int i=0;i<=2;i++)
				{
					doc[i].displaydocinfo();
				}
			}
		case 4:
		{
			{
				String get=JOptionPane.showInputDialog("enter n/d if you want to find doctor by name and department respectively: ");
				int op=Integer.parseInt(get);
				if(input=="n")
				{
					String name=JOptionPane.showInputDialog("enter name of doctor you want to search: ");
					for(int i=0; i<doc.length;i++)
					{
						if(name.equals (doc[i].getname()))
						{
							System.out.println("found");
							}
						else
						{
							System.out.println(" not found");
						}
					}
					break;
				}
					else
					{
						String department=JOptionPane.showInputDialog("enter department of doctor you want to search: ");
						for(int i=0;i<doc.length;i++)
						
							if(department.equals(doc[i].getdepartment()))
							{
								System.out.println(" found");}
							else 
							{
								System.out.println("not found");}
					}
				}
			break;
			}
		case 5:
		{
			((IndoorPatient) p[0]).displayindoorpat();
			break;
		}
		case 6: 
		{
			String day=JOptionPane.showInputDialog("enter day: ");
			String month=JOptionPane.showInputDialog("enter month: ");
			String year=JOptionPane.showInputDialog("enter year: ");
			int d=Integer.parseInt(day);
			int m=Integer.parseInt(month);
			int y=Integer.parseInt(year);
			for(int i=0;i<p.length;i++)
			{
			if((d==((OutDoorPatient) p[i]).getday())&&(m==((OutDoorPatient) p[i]).getmonth())&& (y==((OutDoorPatient) p[i]) .getyear()));
				
		}
			break;
	}
		case 7:
		{
			String name=JOptionPane.showInputDialog("enter name of doctor: ");
			for(int i=0;i<p.length;i++)
			{
				if(name==doc[i].getname())
				{
					doc[i]
				}
				else
				{
					System.out.println("there is no record of this doctor")
				}
			}
		}
		break;
		}
		case 8:
		{
			reposi
		}
		}while(ch!=7);
}
}