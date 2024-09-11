package com.datorium.Datorium.API;

import com.datorium.Datorium.API.DTOs.Book;
import com.datorium.Datorium.API.DTOs.Credentials;
import com.datorium.Datorium.API.DTOs.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) { //only thing that supposet to be here
		System.out.println("asd");
		SpringApplication.run(DatoriumApiApplication.class, args);
	}
}
