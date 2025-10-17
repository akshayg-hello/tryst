package io.indream.tryst.profile_manager.model.request;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserProfileRegister {

    private String firstName;
    private String middleName;
    private String lastName;
    private char gender;
    //    private ContactInfoReq contactInfo;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

//    public ContactInfoReq getContactInfo() {
//        return contactInfo;
//    }
//
//    public void setContactInfo(ContactInfoReq contactInfo) {
//        this.contactInfo = contactInfo;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
