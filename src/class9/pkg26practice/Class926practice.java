package class9.pkg26practice;
import java.util.Scanner;

public class Class926practice {

    public static void main(String[] args) {
        //Get an array from the user of 5 doubles.
        //Print all the numbers back in format
        //As well as their sum, average, min value, and max value 
        //and continue doing so until user inputs -1 for all 5 values
        //Code result should look like below
        //The values you specified are: 1.,2.,3.,4.,5.
        //Sum: 15
        //Average: 3
        //Min: 1
        //Max: 5
        
        Scanner userInput = new Scanner(System.in);

        double[] userArray = new double[5];
        double sum = 0;
        int count = 0;
        for (int i = 0; i < 5; i++)
        {
            count++;
            System.out.print("Enter a number: ");
            userArray[i] = userInput.nextDouble();
            sum += userArray[i];
        }
        
        System.out.print("The values you specified are: ");
        
        for (int i = 0; i < 4; i++)
        {
            System.out.print(userArray[i] + ", ");
        }
        System.out.print("and " + userArray[4]);
        
        System.out.println("");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/count);
        System.out.println("Min: ");
        System.out.println("Max: ");
    }
}
