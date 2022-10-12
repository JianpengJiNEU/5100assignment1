/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jianpeng Ji
 */
public class UserProfileDirectory {

    List<UserProfile> userProfileList;

    public UserProfileDirectory() {
        this.userProfileList = new ArrayList<UserProfile>();
    }

    public List<UserProfile> getUserProfileList() {
        return userProfileList;
    }

    public UserProfile addUserProfile() {
        UserProfile user = new UserProfile();
        userProfileList.add(user);
        return user;
    }

    public void updateUserProfile(int index, UserProfile user){
        userProfileList.set(index, user);
    }
    
    public void removeUserProfile(UserProfile user) {
        userProfileList.remove(user);
    }
    
    public void removeUserProfile(int index) {
        userProfileList.remove(index);
    }

    public UserProfile searchProduct(int id) {
        for (UserProfile user : userProfileList) {
            if (user.getModelNumber() == id) {
                return user;
            }
        }
        return null;
    }

}
