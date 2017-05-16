package com.porcelani;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple endpoints to show Zuul working.
 **/
@RestController
class PingRestController {

    @Value("${message:Hello default}")
    private String message;

    /**
     * @return "Hello Spring Config" when server config is up.
     **/
    @RequestMapping(value = "/message")
    public String message() {
        return message;
    }

    @RequestMapping(value = "/ping")
    public String available() {
        return "zuul pong";
    }
}
