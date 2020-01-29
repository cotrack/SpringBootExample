package com.infotech.app.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorldController {

	
	
	
	
	@CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String loadPresetFile(@PathVariable("presetToLoad") String presetToLoad) throws IOException, InterruptedException {
        return "geht";
    }
	
	
	@CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String returnUserData(@RequestBody Map<String, String> body) throws IOException, InterruptedException {
		
		System.out.println( body );
		
		
        return "geht";
    }
	
	
}
