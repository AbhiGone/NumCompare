import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne;
        int numTwo;

        System.out.println("enter two numbers");
        if(scan.hasNextInt()){
            numTwo = scan.nextInt();
        }else{
            System.out.println("Error: You have entered an invalid integer.");
            return;
        }

        if(scan.hasNextInt()){
            numOne = scan.nextInt();
        }else{
            System.out.println("Error: You have entered an invalid integer.");
            return;
        }

        if(numOne > numTwo){
            System.out.println(numOne + " is greater than " + numTwo);
        }else if(numOne < numTwo){
            System.out.println(numOne + " is less than " + numTwo);
        }else{
            System.out.println(numOne + " is equal to " + numTwo);
        }

    }
}