package com.myapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.domain.Message;

@RestController
public class AppController {
	 @RequestMapping("/rest/{name}")
	    public Message message(@PathVariable String name) {
	        Message msg = new Message(name, "Hi  " + name);
	        return msg;
	    }
}
