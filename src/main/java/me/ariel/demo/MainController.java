package me.ariel.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String showIndex()
    {

        String userName = "";
        System.out.println("Hello, type your name please");
        Scanner keyboard = new Scanner(System.in);
        userName = keyboard.nextLine();
        String greet = "Hello " +userName;
        System.out.println();
        return greet;
    }
}
