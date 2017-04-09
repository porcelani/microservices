package com.porcelani;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
class ResourcesRestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/passwords")
    public String getPasswords() {
        ResponseEntity<String> response = this.restTemplate.getForEntity("http://middle/", String.class);
        return response.getBody();
    }

    @RequestMapping( method = POST, value = "/passwords")
    public String postPasswords(@RequestBody String password) {
        ResponseEntity<String> response = this.restTemplate.postForEntity("http://middle/", password,String.class);
        return response.getBody();
    }
}
