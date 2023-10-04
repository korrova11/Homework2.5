package pro.sky.java.course2.passport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassportController {
    String login;
    String password;
    String confirmPassword;

    @GetMapping(path = "passport")
    public void inp(String login, String password, String confirmPassword) {


        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;

    }
    
    

    @GetMapping
    public void exp() {
        if (login.matches("\\w+")) {
            System.out.println("ок");}
        else {
                System.out.println("ошибка");
            }


        }

    }

