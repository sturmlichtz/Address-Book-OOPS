import java.util.Comparator;


public class Set_Person {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	public Set_Person(String firstName, String lastName, String address, String zip) {
		this.firstName=firstName; 
		this.lastName=lastName;
		this.address=address;
		this.zip=zip;
	}
	
	public static Comparator<Set_Person> FirstNameComparator = new Comparator<Set_Person>() {
		public int compare(Set_Person o1, Set_Person o2) {
			String firstname1 = o1.firstName;
			String firstname2 = o2.firstName;
			
			return firstname1.compareTo(firstname2);
		};
	};
	
	public static Comparator<Set_Person> ZipComparator = new Comparator<Set_Person>() {
		
		@Override
		public int compare(Set_Person o1, Set_Person o2) {
			String zip1 = o1.zip;
			String zip2 = o2.zip;
			
			return zip1.compareTo(zip2);
		}
	};
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Name :- "+firstName + " " +lastName
				+ " City :- " +address + " Zip Code :- " +zip;
	}
	
}