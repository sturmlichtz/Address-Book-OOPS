package Test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
	Scanner scRef = new Scanner(System.in);
	List<Set_Person> person_list = new ArrayList<Set_Person>();
	
	private void add_Person_Info(final String firstName, final String lastName, final String address, final int zip) {
		final Set_Person refForList = new Set_Person(firstName, lastName, address, zip);
		person_list.add(refForList);
	}

	public void addIntoFile() throws IOException {
		PrintWriter pw = null;
		FileOutputStream fo = null;
		File file = null;
		try {
			file = new File("output1.txt");
			pw = new PrintWriter(new FileOutputStream(file));
			fo = new FileOutputStream(file);
			final int datList = person_list.size();
			for (int i = 0; i < datList; i++) {
				pw.write(person_list.get(i).toString() + "\n");
			}
		} finally {
			pw.flush();
			pw.close();
			fo.close();
		}
	}

	private void displayAllData() {
		for (int i = 0; i < person_list.size(); i++) {
			final int entry = i + 1;
			final Set_Person refForAllData = person_list.get(i);
			System.out.println("Entry No " + entry + " :- " + refForAllData.firstName + " " + refForAllData.lastName
					+ " City :- " + refForAllData.address + " Zip Code :- " + refForAllData.zip);
			System.out.println();
		}
	}

	private void sort_byName() {
		Collections.sort(person_list, new Comparator<Set_Person>() {

			@Override
			public int compare(final Set_Person o1, final Set_Person o2) {

				return 0;
			}
		});
	}

	void remove_byEntry() throws ArrayIndexOutOfBoundsException {
		System.out.println("enter the entry no which you want to delete :-");
		final int array_index = scRef.nextInt();
		final int index = (array_index - 1);
		person_list.remove(index);
	}

	void update_byEntry() {
		final int index = 1;
		// person_list.set(index, );
	}

	void getAddressFromUser() {
		System.out.println("Enter First Name :-");
		final String userFirstName = scRef.next();
		System.out.println("Enter Last Name :-");
		final String userLastName = scRef.next();
		System.out.println("Enter City :-");
		final String userAddress = scRef.next();
		System.out.println("Enter Zip code:-");
		final int userZip = scRef.nextInt();

		add_Person_Info(userFirstName, userLastName, userAddress, userZip);
	}

	private void user_Choice() {
		System.out.println("Enter your choice :- ");
		System.out.println("1. Add New Entry");
		System.out.println("2. Delete Entry");
		System.out.println("3. Display All Entry");
		System.out.println("4. Exit");
		final int userChoice = scRef.nextInt();
		switch (userChoice) {
			case 1:
				getAddressFromUser();
				user_Choice();
				break;
			case 2:
				remove_byEntry();
				user_Choice();
				break;
			case 3:
				displayAllData();
				user_Choice();
				break;
			case 4:
				break;
			default:

				break;
		}
	}

	public static void main(final String[] args) throws IOException {
		System.out.println();
		final AddressBook bookRef = new AddressBook();
		bookRef.user_Choice();
		bookRef.addIntoFile();
	}

}