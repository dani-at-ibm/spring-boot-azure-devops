/**
 * 
 */
package com.az.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author P102ITPH1
 *
 */
@RestController
public class Controller {

	@GetMapping("/")
	public String helloWorld() {
		return "hello world";
	}

}
