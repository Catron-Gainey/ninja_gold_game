package com.codingdojo.ninjagoldgame.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaGoldGameController {
	List<String> messages = new ArrayList<>();
	@RequestMapping("/")
	public String index(HttpSession session){
		if(session.getAttribute("goldAmount")==null) {
		session.setAttribute("goldAmount", 0);}
		return "index.jsp";
	}
	@RequestMapping(value="/earnGold", method=RequestMethod.POST)
	public String earnGold(HttpSession session,
		@RequestParam(value="location") String location
			) {
		if ("farm".equals(location)){
			Random random = new Random();
			int NewGoldAmount = (int) session.getAttribute("goldAmount");
			int farmRandomNumber = random.nextInt(11) + 10;
			NewGoldAmount = (NewGoldAmount+farmRandomNumber); 	
			session.setAttribute("goldAmount", NewGoldAmount);
			String message = "You earned/lost " + NewGoldAmount;
		    messages.add(0, message);
		    session.setAttribute("messages", messages);
		}else if ("cave".equals(location)){
			Random random = new Random();
			int NewGoldAmount = (int) session.getAttribute("goldAmount");
			int caveRandomNumber = random.nextInt(6) + 5;
			NewGoldAmount = (NewGoldAmount+caveRandomNumber);
			session.setAttribute("goldAmount", NewGoldAmount);
			String message = "You earned/lost " + NewGoldAmount;
		    messages.add(0, message);
		    session.setAttribute("messages", messages);
		}else if ("house".equals(location)){
			Random random = new Random();
			int NewGoldAmount = (int) session.getAttribute("goldAmount");
			int houseRandomNumber = random.nextInt(4) + 2;
			NewGoldAmount = (NewGoldAmount+houseRandomNumber);
			session.setAttribute("goldAmount", NewGoldAmount);
			String message = "You earned/lost " + NewGoldAmount;
		    messages.add(0, message);
		    session.setAttribute("messages", messages);
		}else if("quest".equals(location)){
			Random random = new Random();
			int NewGoldAmount = (int) session.getAttribute("goldAmount");
			int questRandomNumber = random.nextInt(101) - 50;
			NewGoldAmount = (NewGoldAmount+questRandomNumber);
			session.setAttribute("goldAmount", NewGoldAmount);
			String message = "You earned/lost " + NewGoldAmount;
		    messages.add(0, message);
		    session.setAttribute("messages", messages);
		}
		return "redirect:/";
	}
}
