

public class MedicineInfo
{
	public void displayLabel()
	{
		System.out.println("Company : Globex Pharma");
		System.out.println("Address : Bangalore");
		}
	}
class Tablet extends MedicineInfo
{
	 
public void displayLabel()
{
	System.out.println("store in a cool dry place");
	}
}
class Syrup extends MedicineInfo
{
	public void displayLabel()
	{
		System.out.println("Consumption as directed by thephysician");
		}
	}
class Ointment extends MedicineInfo
{
	public void displayLabel()
	{
		System.out.println("for external use only");
}
}