package com.porcelani;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple endpoint to show Edge working.
 **/
@RestController
class PingRestController {
    @RequestMapping(value = "/ping")
    public String available() {
        return "edge pong";
    }
}
