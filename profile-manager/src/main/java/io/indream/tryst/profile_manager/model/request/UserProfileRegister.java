package io.indream.tryst.profile_manager.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserProfileRegister {

    private String firstName;
    private String middleName;
    private String lastName;
    private char gender;
    private ContactInfoReq contactInfo;
    private String password;

}
