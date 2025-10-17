package io.indream.tryst.profile_manager.util;

import io.indream.tryst.profile_manager.model.request.UserProfileRegister;
import io.indream.tryst.profile_manager.model.response.UserProfile;
import io.indream.tryst.profile_manager.repo.UserProfileDAO;

public class ProfileManagerUtil {


    public static UserProfileDAO createUserProfileDTO(UserProfileRegister upr) {
        UserProfileDAO userProfileDAO = new UserProfileDAO();
        userProfileDAO.setFirstName(upr.getFirstName());
        userProfileDAO.setMiddleName(upr.getMiddleName());
        userProfileDAO.setLastName(upr.getLastName());
        userProfileDAO.setGender(upr.getGender());
        userProfileDAO.setPassword(upr.getPassword());
        return userProfileDAO;
    }

    public static UserProfile createUserProfile(UserProfileDAO usrDao) {
        UserProfile userProfile = new UserProfile();
        userProfile.setUserId(usrDao.getUserId());
        userProfile.setFirstName(usrDao.getFirstName());
        userProfile.setMiddleName(usrDao.getMiddleName());
        userProfile.setLastName(usrDao.getLastName());
        userProfile.setGender(usrDao.getGender());
        return userProfile;
    }
}
