package cn.author.service1.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @Value("${server.port}")
    public  String port;
    @GetMapping("hello")
    public String hello(){
        return "hello"+port;
    }
}
