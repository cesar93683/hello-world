package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/")
public class HelloWorldController {

    private static final Logger LOGGER = LogManager.getLogger(HelloWorldController.class);


    @GetMapping("/")
    public String getQuestions() {
        LOGGER.info("Hello world");
        return "hello world";
    }

}
