/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Sebastian Black
*/

package com.codebode.project;

import java.util.Scanner;

public class WifiDiagnosis 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	 String input;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("If you have a problem with internet connectivity this WiFi Diagnosis might work."
				+ "\n\n");
		System.out.println("Reboot the computer and try to connect again!");
		System.out.println("Did that fix the problem?(Yes or No)");
		input = keyboard.nextLine();
		if (input.equalsIgnoreCase("Yes"))
		{
		}
		else if (input.equalsIgnoreCase("No"))
		{
			System.out.println("Reboot the router and try to connect");
			System.out.println("Did that fix the problem?(Yes or No)");
			input = keyboard.nextLine();
		}
			if (input.equalsIgnoreCase("Yes"))
			{
			}
			else if (input.equalsIgnoreCase("No"))
			{
				System.out.println("Make sure the cables connecting the router are firmly plugged om and power is getting to your router");
				System.out.println("Did that fix the problem?(Yes or No)");
				input = keyboard.nextLine();
			}
				if (input.equalsIgnoreCase("Yes"))
				{
				}
				else if (input.equalsIgnoreCase("No"))
				{
					System.out.println("Move the computer closer to the router and try to connect");
					System.out.println("Did that fix the problem?(Yes or No)");
					input = keyboard.nextLine();
				}
					if (input.equalsIgnoreCase("Yes"))
					{
					}
					else if (input.equalsIgnoreCase("No"))
					{
						System.out.println("Contact your ISP");
						System.out.println("\n Done\n Programmer: Sebastian Black");
					}
					else
					{
			System.out.println("\n Invalid answer; try again");
			}
					System.out.println("\n Done\n Programmer: Sebastian Black");
				}
			}
