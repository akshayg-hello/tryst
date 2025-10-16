package io.indream.tryst.profile_manager.service;

import io.indream.tryst.profile_manager.model.request.UserProfileRegister;
import io.indream.tryst.profile_manager.model.response.UserProfile;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {
    @Override
    public UserProfile getUser(String userId) {
        return null;//TODO: replace this with actual logic for getting the user from DB
    }

    @Override
    public UserProfile createUserProfile(UserProfileRegister userProfileRegister) {
        return null;//TODO:replace this with actual creation and also validation of the request
    }


}
