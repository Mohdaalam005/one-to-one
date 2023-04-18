package github.com.mohdaalam005.springlatest.controller;

import github.com.mohdaalam005.springlatest.service.DemoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class DemoController {


    @GetMapping("/send")
    public ResponseEntity<String>send(){
//        delay(Duration.ofMillis(1000));
        log.info("send called");
        return ResponseEntity.ok().body("hello world");
    }



}
