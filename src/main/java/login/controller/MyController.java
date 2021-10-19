package login.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MyController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
