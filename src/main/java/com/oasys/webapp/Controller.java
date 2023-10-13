package com.oasys.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/webapp")
public class Controller {
	@GetMapping(value="/add")
	public String getmsg( ) {
		return "successfully executed";
	}

}
