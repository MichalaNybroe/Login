package login.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MyController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/myPage")
    public String myPage() {
        return "myPage";
    }

    @GetMapping("/yourGrades")
    public String yourGrades() {
        return "yourGrades";
    }

    @GetMapping("/guessNumber")
    public String guessNumber() {
        return "guessNumber";
    }

    @GetMapping("/Quote")
    public String quote() {
        return "quoteOfDay";
    }

    @GetMapping("/createUser")
    public String createUser(){
        return "myPage";
    }
}
