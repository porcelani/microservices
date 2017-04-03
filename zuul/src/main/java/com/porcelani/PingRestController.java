package com.porcelani;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PingRestController {

    @Value("${message:Hello default}")
    private String message;

    @RequestMapping(value = "/message")
    public String message() {
        return message;
    }

    @RequestMapping(value = "/ping")
    public String available() {
        return "edge pong";
    }
}
