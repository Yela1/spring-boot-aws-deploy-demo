package com.example.demo;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class MainControllerTest extends TestCase {

    MainController mainController = new MainController();
    @Test
    public void test_mainpage(){
        ResponseEntity<String> responseEntity = mainController.getMainPage();
        assertEquals(responseEntity.getBody(), "Hello!");
        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
    }
}