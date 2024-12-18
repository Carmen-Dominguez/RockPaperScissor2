package com.example.rockpaperscissor2;

import java.util.Random;

import android.app.Activity; 
import android.os.Bundle;


public class GameActivity extends Activity
{
	public static String result = "";
	static Random random = new Random();
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game); 
	}
	
	public void gameMethod()
	{
		
	}
	
	static int name_to_number(String name)
    {
        if (name == "rock")
            return 0;
        else if (name == "Spock")
            return 1;
        else if (name == "paper")
            return 2;
        else if (name == "lizard")
            return 3;
        else if (name == "scissors")
            return 4;
        else
            return -1;
    }
	
	static String number_to_name(int number)
    {
        if (number == 0)
            return "rock";
        else if (number == 1)
            return "Spock";
        else if (number == 2)
            return "paper";
        else if (number == 3)
            return "lizard";
        else if (number == 4)
            return "scissors";
        else
            return "Invalid number";
    }
	
	 static void rpsls(String choice)
     {
         // print out the message for the player's choice
         Console.WriteLine("Player chooses {0}", choice);
         
         // convert the player's choice to player_number using the function name_to_number()
         int play_num = name_to_number(choice);
         
         // compute random guess for comp_number using random.randrange()
         int comp_num = random.Next(0,5);
         
         // convert comp_number to comp_choice using the function number_to_name()
         String comp_choice = number_to_name(comp_num);
         // print out the message for computer's choice
         Console.WriteLine("Computer chooses {0}", comp_choice);
         
         // compute difference of comp_number and player_number modulo five
         int diff = (play_num - comp_num) % 5;
         
         // use if/elif/else to determine winner, print winner message
         if (diff == 0)
             result = "It's a tie";
         else if (diff > 0)
             result ="Player wins!";
         else
             result = "Computer wins!";
     }


}
