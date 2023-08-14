package com.example.mycontacts;

import datamodel.Contact;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ContactController {
    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private TextField notesField;

    public Contact getNewContact(){
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String phoneNumber = phoneNumberField.getText();
        String notes = notesField.getText();

        Contact newContact = new Contact(firstName, lastName, phoneNumber, notes);
        return newContact;
    }

    public void editContact(Contact contact) {
        firstNameField.setText(contact.getFirstName());
        lastNameField.setText(contact.getLastName());
        phoneNumberField.setText(contact.getPhoneNumber());
        notesField.setText(contact.getNotes());
    }

    public void updateContact(Contact conatact){
        conatact.setFirstName(firstNameField.getText());
        conatact.setLastName(lastNameField.getText());
        conatact.setPhoneNumber(phoneNumberField.getText());
        conatact.setNotes(notesField.getText());
    }
}

