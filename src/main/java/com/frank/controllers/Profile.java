package com.frank.controllers;
import com.frank.models.profileEntry;
import com.frank.repository.ProfileDAO;
import com.frank.services.profileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RestController
public class Profile extends HttpServlet {
    @Autowired
    profileService service;


    @RequestMapping ("/profileCreate")
    public void addProfile
(HttpServletRequest req, HttpServletResponse res,
   @RequestParam("fname") String fname,
   @RequestParam("lname") String lname,
   @RequestParam("age") int age) throws IOException {


    profileEntry frank = new profileEntry();
        profileEntry tom = new profileEntry();

    frank.setFirstName(fname);
    frank.setLastName(lname);
    frank.setAge(age);


    service.addNewProfile(frank); // how do I check if this worked
        // for the purpose of conditional logic like when the jdbc returned an int for rows affected

    tom.setFirstName("Tom");
    tom.setLastName("Durso");
    tom.setAge(27);
    service.addNewProfile(tom); //how do I check if this worked
        // for the purpose of conditional logic like when the jdbc returned an int for rows affected


    res.sendRedirect("success.html");


    }


}
