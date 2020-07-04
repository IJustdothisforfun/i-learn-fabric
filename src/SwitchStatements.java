import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args){

        int day = Integer.parseInt(System.console().readLine()); // takes input as a integer

        switch(day){
            case (1):
                System.out.println("monday");
                break;
            case (2):
                System.out.println("Tuesday");
                break;
            case (3):
                System.out.print("Wednesday");
                break;
            default: // will print if none of the cases are matched
                System.out.println("enter a number lower than 3 idiot");
                break;

        }
    }
}
