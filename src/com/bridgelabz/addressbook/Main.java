package com.bridgelabz.addressbook;

public class Main {

    public static void main(String[] args) {
        AddressBook addressbook = new AddressBook();
        ContactInfo contact = new ContactInfo("Samuel" ,"Elijah", "Chennai");
        ContactInfo contact1 = new ContactInfo("Magesh" ,"Kiran", "Goa");
        ContactInfo contact2 = new ContactInfo("Sam" ,"David", "Bangalore");
        ContactInfo contact3 = new ContactInfo("Vena" ,"Meena", "Kerala");
        addressbook.contactList.add(contact);
        addressbook.contactList.add(contact1);
        addressbook.contactList.add(contact2);
        addressbook.contactList.add(contact3);

        System.out.println(addressbook.contactList);
    }
}