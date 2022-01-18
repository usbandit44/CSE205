import java.util.ArrayList;
import java.util.Scanner;// imports scanner class

public class Assignment2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int num = scan.nextInt();
        while(num != 0) {
            numbers.add(num);
            num = scan.nextInt();
        }

        if(numbers.size() == 0){
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

    public static int largest(ArrayList<Integer> num){
        int largest = num.get(0);
        for(int i = 1; i < num.size(); i++){
            if(largest < num.get(i)){
                largest = num.get(i);
            }
        }
        return largest;
    }

    public static int largestEven(ArrayList<Integer> num){
        ArrayList<Integer> even = new ArrayList<Integer>();
        for(int i = 0; i < num.size(); i++){
            if(num.get(i) % 2 == 0){
                even.add(num.get(i));
            }
        }
        int largest = even.get(0);
        for(int i = 1; i < even.size(); i++){
            if(largest < even.get(i)){
                largest = even.get(i);
            }
        }
        return largest;
    }

    public static int positive(ArrayList<Integer> num){
        int count = 0;
        for(int i = 0; i < num.size(); i++){
            if(num.get(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int sum(ArrayList<Integer> num){
        int sum = 0;
        for(int i = 0; i < num.size(); i++){
            sum = sum + num.get(i);
        }
        return sum;
    }
}
