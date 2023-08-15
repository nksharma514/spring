package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//	http://localhost:8080/springmvc/home
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url, Spring MVC is working fine");

		model.addAttribute("name", "Narendra Sharma");
		model.addAttribute("id", 9874);

		List<String> friend = new ArrayList<>();
		friend.add("Suman");
		friend.add("Sushmita");
		friend.add("Shyam");
		friend.add("Shivansh");

		model.addAttribute("f", friend);

		return "index";
	}

//	http://localhost:8080/springmvc/about
	@RequestMapping("/about")
	public String about(Model model) {
		System.out.println("This is all about me");
		model.addAttribute("place", "New Delhi");

		List<Integer> number = new ArrayList<>();
		number.add(123);
		number.add(456);
		number.add(789);
		number.add(1122);
		number.add(223344);

		model.addAttribute("num", number);

		return "about";
	}

//	http://localhost:8080/springmvc/date
	@RequestMapping("/date")
	public ModelAndView date() {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("Hello", "Hello Wolrd....");

		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);

		modelAndView.setViewName("date");
		return modelAndView;
	}

//	http://localhost:8080/springmvc/help
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help page");

//		creating model and view object
		ModelAndView modelAndView = new ModelAndView();

//		setting the data
		modelAndView.addObject("name1", "Kiran");
		modelAndView.addObject("place", "Kolkata");

//		setting the view name
		modelAndView.setViewName("help");

		return modelAndView;
	}

}
