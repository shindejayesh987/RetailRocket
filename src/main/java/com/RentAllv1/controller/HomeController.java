package com.RentAllv1.controller;


import com.RentAllv1.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<ApiResponse> homeController(){

        ApiResponse res=new ApiResponse("Welcome To RentAll", true);

        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}