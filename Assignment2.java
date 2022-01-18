// Assgingment: Assignment2.java
// Name: Arvin Edouard
// ID Number: 1222200512
// Class: Tuesday Thursday 1:30 to 2:45
// Description: Program that takes a uncertain amount of numbers from the user then preforms certain calculations

import java.util.ArrayList;// imports array list
import java.util.Scanner;// imports scanner class

public class Assignment2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int num = scan.nextInt(); // loop to get the numbers from the users until they input 0
        while(num != 0) {
            numbers.add(num);
            num = scan.nextInt();
        }

        if(numbers.size() == 0){ // prints calculations 
            System.out.println("The largest integer in the sequence is " + 0);
            System.out.println("The largest even integer in the sequence is " + 0);
            System.out.println("The count of positive integers in the sequence is " + 0);
            System.out.println("The sum of all integers is " + 0);
        }else{
            System.out.println("The largest integer in the sequence is " + largest(numbers));
            System.out.println("The largest even integer in the sequence is " + largestEven(numbers));
            System.out.println("The count of positive integers in the sequence is " + positive(numbers));
            System.out.println("The sum of all integers is " + sum(numbers));    
        }
    
    }

    public static int largest(ArrayList<Integer> num){ // method that calculates the largest number in a array list
        int largest = num.get(0);
        for(int i = 1; i < num.size(); i++){
            if(largest < num.get(i)){
                largest = num.get(i);
            }
        }
        return largest;
    }

    public static int largestEven(ArrayList<Integer> num){ // method that calcultes the largerst even number in a array list
        ArrayList<Integer> even = new ArrayList<Integer>();
        for(int i = 0; i < num.size(); i++){ // puts all the even numbers in the array list
            if(num.get(i) % 2 == 0){
                even.add(num.get(i));
            }
        }
        if(even.size() > 0){ // gets  the largerst number in the even array list
            int largest = even.get(0);
        for(int i = 1; i < even.size(); i++){
            if(largest < even.get(i)){
                largest = even.get(i);
            }
        }
        return largest;
        }else{
            return 0;
        }
       
    }

    public static int positive(ArrayList<Integer> num){ // method that calculates how many positives in a array list
        int count = 0;
        for(int i = 0; i < num.size(); i++){
            if(num.get(i) > 0){
                count++;
            }
        }
        return count;
    }

    public static int sum(ArrayList<Integer> num){ // method that caluctes the total sum of an arrat list
        int sum = 0;
        for(int i = 0; i < num.size(); i++){
            sum = sum + num.get(i);
        }
        return sum;
    }
}
