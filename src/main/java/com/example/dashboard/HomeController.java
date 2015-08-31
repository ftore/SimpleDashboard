package com.example.dashboard;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.dashboard.domain.Content;
import com.example.dashboard.services.ContentService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private ContentService contentService;
	
	private static final Logger LOGGER = 
			LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String boardList(Model model) {
		
		List<Content> contentList = contentService.getContentList();
		model.addAttribute("contentList", contentList);
		
		return "index";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	@ModelAttribute
	public Content createContent() {
		return new Content();
	}
	
	@InitBinder("content")
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields("id");
		
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String handleCreateContent(@ModelAttribute("content") Content content,
			BindingResult result, RedirectAttributes redirect) {
		
		if(result.hasErrors()) {
			return "/create";
		}
		
		content.setCreator("Mashhur Sattorov");
		
		int insertResult = contentService.insertContent(content);
		
		if(insertResult <= 0) {
			redirect.addFlashAttribute("errorMessage", "content.details.save.error");
			return "redirect:/";
		}
		
		redirect.addFlashAttribute("successMessage", "content.details.save.success");
		return "redirect:/";
	}
}
