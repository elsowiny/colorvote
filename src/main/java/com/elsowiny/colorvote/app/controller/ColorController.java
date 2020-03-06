package com.elsowiny.colorvote.app.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.elsowiny.colorvote.app.model.Color;
import com.elsowiny.colorvote.app.model.ColorAndVotes;
import com.elsowiny.colorvote.app.model.Vote;
import com.elsowiny.colorvote.app.service.ColorServiceImpl;
import com.elsowiny.colorvote.app.service.VoteServiceImpl;



@Controller
public class ColorController {

	@Autowired
	private ColorServiceImpl colorService;
	
	@Autowired
	private VoteServiceImpl voteService;
	
	@GetMapping("/showColors")
	public String findColors(Model theModel) {
		
		
		List<Color> colors = (List<Color>) colorService.findAll();
		List<Vote> votes = (List<Vote>) voteService.findAll();
		List<ColorAndVotes> colorAndVotes = new ArrayList<ColorAndVotes>();

		//create new list of objects of type color and votes that
		//combine colors and votes from the two lists read from the db
		for (Color tempColor: colors) {
			ColorAndVotes colorAndVotesObj = new ColorAndVotes();
			colorAndVotesObj.setColor(tempColor.getColor());
			colorAndVotesObj.setVotes(
						findTotalForColor(tempColor.getColor())
					);
			colorAndVotes.add(colorAndVotesObj);
		}
		theModel.addAttribute("votes", votes);
		theModel.addAttribute("colors", colors);
		theModel.addAttribute("colorsandvotes",colorAndVotes);
		
		
		return "showColors";
	}

	//helper methods
	public int findTotalForColor(String colorToTally) {
		List<Vote> votes = (List<Vote>) voteService.findAll();
		int total = 0;
		for(Vote tempVote: votes) {
			if((tempVote.getColor()).equalsIgnoreCase(colorToTally)) {
				total += tempVote.getVotes();
			}
		}
		return total;
	}
	
	
}
