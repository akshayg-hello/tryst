package io.indream.tryst.profile_manager.service;

import io.indream.tryst.profile_manager.model.request.UserProfileRegister;
import io.indream.tryst.profile_manager.model.response.UserProfile;

public interface UserProfileService {
    UserProfile getUser(String userId);

    UserProfile createUserProfile(UserProfileRegister userProfileRegister);

}
