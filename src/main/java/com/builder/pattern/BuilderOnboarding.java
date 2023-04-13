package com.builder.pattern;

public class BuilderOnboarding {

    //GET ALL ATTRIBUTES from Onboarding class
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

    //Setters for all attributes
    //Return same builder class object
    public BuilderOnboarding setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BuilderOnboarding setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BuilderOnboarding setAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public BuilderOnboarding setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public BuilderOnboarding setState(String state) {
        this.state = state;
        return this;
    }

    public BuilderOnboarding setCity(String city) {
        this.city = city;
        return this;
    }

    public BuilderOnboarding setCountry(String country) {
        this.country = country;
        return this;
    }

    public BuilderOnboarding setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public BuilderOnboarding setAdhaar(String adhaar) {
        this.adhaar = adhaar;
        return this;
    }

    public BuilderOnboarding setPan(String pan) {
        this.pan = pan;
        return this;
    }

    public BuilderOnboarding setSsn(String ssn) {
        this.ssn = ssn;
        return this;
    }

    public BuilderOnboarding setNricFront(String nricFront) {
        this.nricFront = nricFront;
        return this;
    }

    public BuilderOnboarding setNricBack(String nricBack) {
        this.nricBack = nricBack;
        return this;
    }

    public Onboarding getOnboardingObject(){
        return new Onboarding(this.firstName,
                this.lastName,
                this.address1,
                this.address2,
                this.state,
                this.city,
                this.country,
                this.phoneNo,
                this.adhaar,
                this.pan,
                this.ssn,
                this.nricFront,
                this.nricBack);
    }

}
