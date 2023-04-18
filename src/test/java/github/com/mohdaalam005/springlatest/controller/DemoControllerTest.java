package github.com.mohdaalam005.springlatest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoControllerTest {


    @Test
    void send () {
        DemoController demoController =new DemoController();
        ResponseEntity<String> send = demoController.send();
        assertEquals(HttpStatus.OK, send.getStatusCode());
        assertEquals("hello world", send.getBody());

    }
}