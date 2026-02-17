package com.springbootsamplerestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootsamplerestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsamplerestapiApplication.class, args);
	}

    @GetMapping("/getTestApiMessage")
    public String getApiTestMessage(){
        try {
            return "get api test message is returned";
        }
        catch(Exception e){
            return e.getMessage();
        }
    }

}
