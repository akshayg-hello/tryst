package io.indream.tryst.profile_manager.controller;

import io.indream.tryst.profile_manager.model.request.UserProfileRegister;
import io.indream.tryst.profile_manager.model.response.UserProfile;
import io.indream.tryst.profile_manager.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/pm/")
public class UserController {

    @Autowired
    private UserProfileService userProfileService;

    @GetMapping("user/{id}")
    public UserProfile getUser(@PathVariable String id) {
        return userProfileService.getUser(id);
    }

    @PostMapping("user")
    public UserProfile createUser(@RequestBody UserProfileRegister userProfileRegister) {
        return userProfileService.createUserProfile(userProfileRegister);
    }
}
