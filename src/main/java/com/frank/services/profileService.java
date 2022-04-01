package com.frank.services;

import com.frank.models.profileEntry;
import com.frank.repository.ProfileDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class profileService {

    @Autowired
    private ProfileDAO profile;

    public void addNewProfile(profileEntry newProfile){



         profile.save(newProfile);
    }
}
