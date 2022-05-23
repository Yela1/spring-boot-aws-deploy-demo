package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class MainController {

    @GetMapping
    public ResponseEntity<String> getMainPage(){
        return new ResponseEntity<>("Hello!", HttpStatus.OK);
    }
}
