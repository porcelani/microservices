package com.porcelani.resources;

import com.porcelani.models.Password;
import com.porcelani.services.PasswordReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Endpoints to call services from Middle
 **/
@RestController
public class PasswordResource {

    @Autowired
    private PasswordReviewService passwordReviewService;

    /**
     * @return All passwords from the database
     **/
    @RequestMapping(value = "/")
    public List<Password> getPasswords() {
        return passwordReviewService.reviews();
    }


    /**
     * @param password is a string that will be analysed
     * @return The password with some characteristics saved in database
     **/
    @RequestMapping(method = POST, value = "/")
    public Password postPassword(@RequestBody String password) {
        return passwordReviewService.review(password);
    }
}
