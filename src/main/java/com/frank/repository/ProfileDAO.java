package com.frank.repository;

import com.frank.models.profileEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileDAO extends JpaRepository<profileEntry,Integer> {


}
