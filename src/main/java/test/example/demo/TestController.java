package test.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publish")
@ResponseBody
public class TestController
{
	@GetMapping("/helloworld")
	public String test()
	{
		System.out.println("Hello World");
		return "Hello World";

	}

}
