package com.company;


public class Main {

    public static void main(String[] args) {
	ContactsManager myContactsManager = new ContactsManager();

	Contact Juan = new Contact();
	Juan.name = "Juan";
	Juan.phoneNumber = "773-905-1234";

	Contact James = new Contact();
	James.name = "James";
	James.phoneNumber = "773-905-4678";

	Contact Jaime = new Contact();
	Jaime.name = "Jaime";
	Jaime.phoneNumber = "773-905-1234";

	myContactsManager.addContact(Juan);
	myContactsManager.addContact(James);
	myContactsManager.addContact(Jaime);

	System.out.println("We are searching for James: "+ myContactsManager.searchContact("James").phoneNumber);



    }


}
