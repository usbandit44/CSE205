// Assignment #: 1
//         Name: Your name
//    StudentID: Your Student ID
//      Lecture: Your Lecture time
//  Description: This class reads an integer from a keyboard and prints it out
//               along with other messages.

import java.util.Scanner;  // use the Scanner class located in the "java.util" directory

public class Assignment1
 {
  public static void main (String[] args)
   {
     int number;

     Scanner console = new Scanner(System.in);

     number = console.nextInt();     // read an integer entered by a user


     // display the number with other messages
	     System.out.print("This program reads an integer from a keyboard\n"
	                    + "and prints it out on the screen.\n"
	                    + "make sure that you get the same output as the expected one.\n"
                   + "the read number is " + number + ".\n");
   }
 }


