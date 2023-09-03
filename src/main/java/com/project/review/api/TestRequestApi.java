package com.project.review.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestRequestApi {

    @GetMapping("/test/param")
    public String requestParam(@RequestParam String name, @RequestParam Integer age) {
        return "Hello, Request Param" + name + age;
    }

    @GetMapping("/test/path/{name}/{age}")
    public String requestPathVariable(@PathVariable String name, @PathVariable Integer age) {
        return "Hello, Path Variable" + name + age;
    }

    @PostMapping("/test/body")
    public String requestBody(@RequestBody TestRequestBody request) {
        return "Hello, Request Body"+ request.name + request.age;
    }

    public static class TestRequestBody{
        String name;
        Integer age;

        public TestRequestBody(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}
