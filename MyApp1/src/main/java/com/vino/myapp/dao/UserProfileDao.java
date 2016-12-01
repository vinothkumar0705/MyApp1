package com.vino.myapp.dao;

import java.util.List;
 
import com.vino.myapp.model.UserProfile;
 
 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}
