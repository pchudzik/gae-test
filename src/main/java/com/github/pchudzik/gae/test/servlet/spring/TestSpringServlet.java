package com.github.pchudzik.gae.test.servlet.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.google.appengine.repackaged.com.google.common.base.Strings.nullToEmpty;

/**
 * User: pawel
 * Date: 20.07.13
 * Time: 10:20
 */
@Controller
@RequestMapping("/spring")
public class TestSpringServlet {

	@RequestMapping(value = "/{hello}", method = RequestMethod.GET)
	public String hello(@PathVariable String hello, ModelMap modelMap) {
		modelMap.put("hello", nullToEmpty(hello));
		return "helloSpring";
	}
}
