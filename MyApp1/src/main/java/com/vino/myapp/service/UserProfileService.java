package com.vino.myapp.service;

import java.util.List;
 
import com.vino.myapp.model.UserProfile;
 
 
public interface UserProfileService {
 
    UserProfile findById(int id);
 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
     
}