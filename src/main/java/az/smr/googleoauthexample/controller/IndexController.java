package az.smr.googleoauthexample.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import az.smr.googleoauthexample.entity.User;

@Controller
public class IndexController {

	@RequestMapping("/profile")
	ModelAndView profile(@AuthenticationPrincipal User user) {
		return new ModelAndView("index", "user", user);
	}
	
	@RequestMapping("/")
	public ModelAndView index(HttpServletResponse response, @AuthenticationPrincipal User user) throws IOException {
		if (user!=null) {
			response.sendRedirect("/profile");
		}
		return new ModelAndView("login");
	}
	
}
