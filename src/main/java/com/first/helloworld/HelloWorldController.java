package com.first.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public Map<String, String> hello() {  //簡単な構造であればMapで表現するとSpringが「JSON」形式に変換してくれる。
        return Map.of("massage", "hello world");
        //普通だったらこれでいい。「public String hello() {　return "hello world";　」
    }

}
