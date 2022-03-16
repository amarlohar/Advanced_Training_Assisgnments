import java.util.*;
public class Main 
{
            public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int i=0;
            PhoneBook objmain=new PhoneBook();
            while(i==0)
            {
                System.out.println("Menu\n1.Add Contact\n2.Search Phone number\n3.Exit");
                System.out.println("Enter your choice: ");
                int n=Integer.parseInt(sc.nextLine());
                if(n==1)
                {
                    Contact obj=new Contact();
                    System.out.println("Add a contact: ");
                    
                    System.out.println("Enter the Name: ");
                    obj.setName(sc.nextLine());
                   
                    System.out.println("Enter the Phone No. : ");
                    obj.setPhoneNumber(Long.parseLong(sc.nextLine()));
                    
                    objmain.addContact(obj);
                }
               
                if(n==2)
                {
                    System.out.println("Enter the Phone number to search contact:");
                    Long n1=Long.parseLong(sc.nextLine());
                    Contact obj1=objmain.viewContactGivenPhone(n1);
                    System.out.println("The contact is:");
                    System.out.println("Name:"+obj1.getname());
                    
                    System.out.println("Phone No.:"+obj1.getPhoneNumber());
                   
                }
             
                if(n==3)
                {
                	System.out.println("Thank You !!!");
                	System.exit(0);
                    
                }
            }
        }
    }