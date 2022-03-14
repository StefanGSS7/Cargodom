package cdom;

import org.apache.commons.lang.RandomStringUtils;

public class RegistrationFormVariables {

    String createdAsTransporterEmail = "SK@brainster2.com";
    String createdAsLookingForTransporterEmail = "SK@brainster.com";
    String asTransporterAsUserpassword = "asdqwe123";
    String firstName = "Stefan";
    String lastName = "Kuzmanovski";
    String address = "Aaaa Aaaaaa 51";
    String city = "Skopje";
    String PostalCode = "1000";
    String country = "Macedonia";
    String phoneNumber = "111111111";
    String companyName = "Aaaa Aaaaaa";
    String taxNumber = RandomStringUtils.randomNumeric(13);
    String emailAsTransporter = RandomStringUtils.randomAlphabetic(5)+"@"+RandomStringUtils.randomAlphabetic(5)+".com";
    String password = RandomStringUtils.randomAlphanumeric(12);
    String emailAsLookingForTransporter = RandomStringUtils.randomAlphabetic(5)+"@"+RandomStringUtils.randomAlphabetic(5)+".com";

    public String getCreatedAsTransporterEmail() {
        return createdAsTransporterEmail;
    }

    public void setCreatedAsTransporterEmail(String createdAsTransporterEmail) {
        this.createdAsTransporterEmail = createdAsTransporterEmail;
    }

    public String getCreatedAsLookingForTransporterEmail() {
        return createdAsLookingForTransporterEmail;
    }

    public void setCreatedAsLookingForTransporterEmail(String createdAsLookingForTransporterEmail) {
        this.createdAsLookingForTransporterEmail = createdAsLookingForTransporterEmail;
    }

    public String getAsTransporterAsUserpassword() {
        return asTransporterAsUserpassword;
    }

    public void setAsTransporterAsUserpassword(String asTransporterAsUserpassword) {
        this.asTransporterAsUserpassword = asTransporterAsUserpassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getEmailAsTransporter() {
        return emailAsTransporter;
    }

    public void setEmailAsTransporter(String emailAsTransporter) {
        this.emailAsTransporter = emailAsTransporter;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAsLookingForTransporter() {
        return emailAsLookingForTransporter;
    }

    public void setEmailAsLookingForTransporter(String emailAsLookingForTransporter) {
        this.emailAsLookingForTransporter = emailAsLookingForTransporter;
    }
}
