package com.deepweb.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //It's used to mark a class as a web request handler..
public class SayHelloController {
	
	@RequestMapping("say-hello")//do mapping for the url..
	@ResponseBody  //send whatever you returning to the browser..
	public String sayHello() {
		return "Hello! What are you learning today?";
	}

	@RequestMapping("say-hello-html")//do mapping for the url..
	@ResponseBody  //send whatever you returning to the browser..
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First Title</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("my first html page with head, body and title");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")//do mapping for the url..
	//@ResponseBody  //send whatever you returning to the browser..
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}
