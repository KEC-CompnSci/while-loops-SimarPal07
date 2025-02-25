
import java.util.Scanner;

public class Assignment {
    // DO NOT MODIFY THIS SCANNER
    // This will be used to autograde your solution
    public static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
      String repeated = repeatWord("Hello", 3);
      System.out.println(repeated);
      String pyramid = createPyramid(3);
      System.out.println(pyramid);
      String FizzBuzz = countTo(16);
      System.out.println(FizzBuzz);
      
    }
    
    /**
     * Exercise 1: Word Repeater
     * Repeat the provided word the specified number of times
     * Example: word="hello" times=3 → "hello hello hello"
     */
    public static String repeatWord(String word, int times) {
       
        // TODO: Implement this method
        // Use a while loop to build a string that repeats the word
        // Words should be separated by single spaces
        // No trailing space at the end
        String Repeatedword = word;
        if(times == 0) {
            return "";
        }

        while(times > 1) {

            Repeatedword = Repeatedword + " " + word;
            times--;
            
        }
        return Repeatedword;

    
    }
    
    /**
     * Exercise 2: Number Pyramid
     * Create a string pyramid of numbers from 1 to maxNumber
     * Example: maxNumber=3 →
     * 1
     * 22
     * 333
     */
    public static String createPyramid(int maxNumber) {
        // TODO: Implement this method
        // Use nested while loops:
        // - Outer loop for each row
        // - Inner loop to repeat the number
        // Use \n for newlines
        String pyramidstr = "";
        int i = 1;
        while (i <= maxNumber) {
            int j = 1;
            while (j <= i) {
                
                pyramidstr = pyramidstr += i;
                j++;
            }
            pyramidstr = pyramidstr + "\n";
            i++;
            

            
            

            


        }
    

        return pyramidstr;
    }
    
 
    
    
    /**
     * Exercise 3: Counting Game
     * Return a string of numbers replacing:
     * - Multiples of 3 with "Fizz"
     * - Multiples of 5 with "Buzz"
     * - Multiples of both with "FizzBuzz"
     * Example: countTo(6) → "1 2 Fizz 4 Buzz Fizz"
     */
    public static String countTo(int maxNumber) {
        // TODO: Implement this method
        // Use a while loop
        // Use string concatenation
        // Numbers/words should be separated by spaces
        // No trailing space at the end
        String fizzbuzz = "";
        int i = 1;
        while(i <= maxNumber) {
            if (i % 15 == 0) {
                fizzbuzz = fizzbuzz + " " + "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzbuzz = fizzbuzz + " " + "Fizz";
            } else if (i % 5 == 0) {
                fizzbuzz = fizzbuzz + " " + "Buzz";
            } else {
                

            fizzbuzz = fizzbuzz + " " + i;
            }
            i++;
            
            
        }
        return fizzbuzz;
    }
    
  
}