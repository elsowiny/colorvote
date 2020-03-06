package com.elsowiny.colorvote.app.model;

public class ColorAndVotes {
	private String Color;
	private int votes;
	
	//no arg constructor
		public ColorAndVotes() {}	
		
		public ColorAndVotes(String color, int votes) {
			Color = color;
			this.votes = votes;
		}


		public String getColor() {
			return Color;
		}


		public void setColor(String color) {
			Color = color;
		}


		public int getVotes() {
			return votes;
		}


		public void setVotes(int votes) {
			this.votes = votes;
		}

		
		
}
