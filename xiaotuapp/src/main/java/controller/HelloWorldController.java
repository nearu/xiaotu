package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.TestDao;

@Controller
@RequestMapping("/index")
public class HelloWorldController {

	@Autowired
	private TestDao testD;

	@RequestMapping(method = RequestMethod.GET)
	public String hello(ModelMap model) {
		model.addAttribute("name", testD.getMsg());
		return "index";
	}
}
