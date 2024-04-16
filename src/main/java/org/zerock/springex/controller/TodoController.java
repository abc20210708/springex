package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@Log4j2
public class TodoController {

    @RequestMapping("/list")
    public void list(){
        log.info("todo list! ");
    }

    //@RequestMapping(value = "/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public void register() {
        log.info("GET todo register...");
    }

    @PostMapping("/register")
    public void registerPost() {
        log.info("POST todo register...");
    }

    @GetMapping("/ex1")
    public void ex1(String name, int age) {
        log.info("== ex1 ==");
        log.info(" == name:  "+ name);
        log.info(" == age:  "+ age);
    }

    @GetMapping("/ex2")
    public void ex2(@RequestParam(name = "name", defaultValue = "AAA") String name,
                    @RequestParam(name = "age", defaultValue = "20") int age) {
        log.info("ex2 ===========");
        log.info("name: " + name);
        log.info("age: " + age);

    }

    @GetMapping("/ex3")
    public void ex3(LocalDate dueDate) {
        log.info("ex3 ===");
        log.info("dueDate : " + dueDate);
    }

}
