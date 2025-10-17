package io.indream.tryst.profile_manager.service;

import io.indream.tryst.profile_manager.model.request.UserProfileRegister;
import io.indream.tryst.profile_manager.model.response.UserProfile;
import io.indream.tryst.profile_manager.repo.UserProfileDAO;
import io.indream.tryst.profile_manager.repo.UserProfileRepository;
import io.indream.tryst.profile_manager.util.ProfileManagerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserProfileServiceImpl implements UserProfileService {
    private static final Logger LOGGER = LoggerFactory.getLogger("UserProfileServiceImpl");

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Override
    public UserProfile getUser(String userId) {
        return null;//TODO: replace this with actual logic for getting the user from DB
    }

    @Override
    public UserProfile createUserProfile(UserProfileRegister userProfileRegister) {
        LOGGER.debug("Got request to create a user profile ..");
        UserProfileDAO userDao = ProfileManagerUtil.createUserProfileDTO(userProfileRegister);
        UserProfileDAO usrDao = userProfileRepository.save(userDao);
        LOGGER.debug("User created with user id : {}", usrDao.getUserId());
        LOGGER.debug("User details : {}", usrDao);
        return ProfileManagerUtil.createUserProfile(usrDao);
    }


}
