package io.indream.tryst.profile_manager.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ContactInfoReq {

    private String primaryNumber;
    private String email;
    private String emergencyContact;

}
