package com.builder.pattern;

public class Onboarding {

    //Common attributes for onboarding class
    String firstName;
    String lastName;
    String address1;
    String address2;
    String state;
    String city;
    String country;
    String phoneNo;

    //india -- Collect Adhar and Pan information
    String adhaar;
    String pan;

    //USA -- Collect SSN number
    String ssn;

    //Singapore -- Collect NRIC front and back
    String nricFront;
    String nricBack;

    //Common Constructor assigning values
    public Onboarding(String firstName, String lastName, String address1, String address2,
                      String state, String city, String country, String phoneNo,
                      String adhaar, String pan, String ssn, String nricFront, String nricBack) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.state = state;
        this.city = city;
        this.country = country;
        this.phoneNo = phoneNo;
        this.adhaar = adhaar;
        this.pan = pan;
        this.ssn = ssn;
        this.nricFront = nricFront;
        this.nricBack = nricBack;
    }

    //No setter methods
    //No getter methods

    //ToSTRING class for onboarding object
    @Override
    public String toString() {
        return "Onboarding{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", adhaar='" + adhaar + '\'' +
                ", pan='" + pan + '\'' +
                ", ssn='" + ssn + '\'' +
                ", nricFront='" + nricFront + '\'' +
                ", nricBack='" + nricBack + '\'' +
                '}';
    }
}
