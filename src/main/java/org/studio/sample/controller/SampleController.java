package org.studio.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String getOK() {
        return "All Good.";
    }

    @GetMapping("/welcome")
    public String welcome(@RequestHeader("name") String name) {
        return "Welcome " + name;
    }
}
