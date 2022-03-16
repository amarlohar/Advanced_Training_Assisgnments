public class Contact {

  private String Name;

  private long  phoneNumber;
 
  public Contact(){}
  public String getname() {
    return Name;
  }
  public void setName(String name) {
    this.Name = name;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Contact(String firstName, String lastName, long phoneNumber,
      String emailId) {
    super();
    this.Name = firstName;
   
    this.phoneNumber = phoneNumber;
    
  }
}