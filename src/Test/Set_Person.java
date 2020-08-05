package Test;
public class Set_Person {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	int phone;
	public Set_Person(String firstName, String lastName, String address, int zip) {
		this.firstName=firstName; 
		this.lastName=lastName;
		this.address=address;
		this.zip=zip;
	}
	
    public String getFirstName() {
        return firstName;
    }  
    public void setName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
		return lastName;
	}  
    public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
    public String getAddress() {
		return address;
	}
    public void setAddress(String address) {
		this.address = address;
	}
       
    public int getZip() {
		return zip;
	}
    public void setZip(int zip) {
		this.zip = zip;
	}
    
    
    public String toString() {	
    	return "Name :- " +this.getFirstName()+ " " +this.getLastName()+ " Address :- "+this.getAddress()+" "+this.getZip() ;
        
    }
    
}
