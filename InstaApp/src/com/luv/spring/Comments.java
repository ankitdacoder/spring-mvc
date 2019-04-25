package com.luv.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("comments")
public class Comments {

	@RequestMapping("/getComments")
	public String getComments(Model model) {
		CommentModel cm=new CommentModel();
		model.addAttribute("commentmodel",cm);
		return "comments";
	}

	@RequestMapping("/postComments")
	public String postComments(@ModelAttribute("commentmodel") CommentModel cmd) {
		System.out.println("*******************" + cmd.getUserid() + " " + cmd.getFeedid() + cmd.getcType());

		return "data-comments";
	}

}
