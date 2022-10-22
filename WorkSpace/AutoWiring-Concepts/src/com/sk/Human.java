package com.sk;

import org.springframework.beans.factory.annotation.Autowired;

public class Human
{
	
	private Heart heart;


	public Human()
	{
		this.heart = new Heart();
		
	}

	public Human(Heart heart) {
		super();
		this.heart = heart;
		
		System.out.println("Human Constructor class-  paramatrized");
	}
	
	
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter Method Called Human-Classes // heart object");
		
	}
	
	public void startPumping()
	{
		
		if(heart!=null)
		{
			heart.pump();
		}
		else {
			System.out.println(heart);
			System.out.println("You are dead");
		}
	}
	
	
	

}
