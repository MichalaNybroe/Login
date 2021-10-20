package login.controller;

import login.service.DBManager;
import login.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;

public class MyController {
    private UserService us;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/myPage")
    public String login(Model model, String username, String password){
        String query = "SELECT " + username + ", " + password + "FROM users";
        boolean checkUser = us.checkUser(query);

        if(checkUser == true){
            model.addAttribute("user", username);
            return "myPage";
        }

        return "failedLogin";
    }

    @PostMapping("/createUser")
    public String createUser(Model model, @RequestParam String username, @RequestParam String password){
        us.createUser(username, password);
        model.addAttribute("user", us.getUser());
        return "index";
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

}
