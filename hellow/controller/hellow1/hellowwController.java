package com.helloworld.hellow.controller.hellow1;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController

	@RequestMapping("/helloww")
	public class hellowwController {

		@GetMapping
		public String hellow() {
			return "Objetivos ---> Tenho como objetivo essa semana, "
					+ "conseguir entender a matéria e ajudar a todos!";
		}
	}

