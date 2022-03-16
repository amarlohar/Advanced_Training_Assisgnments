import java.util.*;
public class PhoneBook
{
    private List<Contact> phoneBook=new ArrayList<Contact>();
    public void setPhoneBook(List<Contact>obj)
    {
        phoneBook=obj;
    }
    public List<Contact>getPhoneBook()
    {
        return phoneBook;
    }
    public void addContact(Contact contactObj)
    {
        phoneBook.add(contactObj);
    }
    public List<Contact> viewAllContacts()
    {
        return phoneBook;
    }
    public Contact viewContactGivenPhone(long phoneNumber)
    {
        Contact obj=new Contact();
        for(Contact obj1:phoneBook)
        {
            if(obj1.getPhoneNumber()==phoneNumber)
            {
                obj=obj1;
            }
        }
        return obj;
    }
   
}