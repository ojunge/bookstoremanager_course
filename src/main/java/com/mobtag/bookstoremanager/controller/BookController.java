package com.mobtag.bookstoremanager.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Adronilson Junge
 */
@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @ApiOperation(value = "Return an example hello world")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success method return")
    })
    @GetMapping
    public String hello(){

        String item = new String();
        if(item == "TESTE")
            return "";
        return "Hello Bookstore manager, I'm runnung a pull request example";
    }
}
