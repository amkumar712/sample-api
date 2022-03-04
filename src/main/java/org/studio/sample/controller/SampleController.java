package org.studio.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/welcome")
    public String welcome(@RequestHeader(value = "name", required = false) String name) {

        if(name == null || name.isEmpty()) {
            return "Welcome Guest!!!";
        }
        return "Welcome " + name;
    }
}
