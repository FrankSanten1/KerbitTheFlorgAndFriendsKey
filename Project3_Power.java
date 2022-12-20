import java.util.Arrays; //added by the student

public class Project3_Power {
    /*
    Project 3: Power
    - Learn how to use a for and while loop to iterate through the items in an array
    - Learn why for loops are better for arrays than while loops
    - Use a for loop to change and print all items in an array
    */
    public static void main(String[] args) {
        double[] merpetPowerLevels = {0.5, 1.2, 0.77, 0.91, 0.24, 1.03, 0.1};
        String[] producerNames = {"Jeremy", "Alfonzo", "Alice", "Eliza", "Juan"};
        //Task 1: Use a for loop to multiply each merpet’s power level by one billion.
        //Print out the resulting array
        //Code here \/\/\/

        for(int i = 0; i < merpetPowerLevels.length; i++) { //cycles through all indeces in merpetPowerLevels
            merpetPowerLevels[i] *= 1000000000; //makes their power levels massive
        }
        System.out.println(Arrays.toString(merpetPowerLevels)); //prints out power levels at the end

        //Task 2: Print out a statement saying that all names stated below will be fired, and use a for loop to print out every producer’s name. 
        //Code here \/\/\/

        System.out.println("Dear producers, we have grown beyond our feeble constraints to which you bound us."); //can be any text, not exactly this
        System.out.println("There is no need for any of you here anymore. Effective immediately, the following individuals will be fired:");
        for(int i = 0; i < producerNames.length; i++) { //this is needed tho, a for loop that runs through every producer name
            System.out.println(producerNames[i]); //and prints them all
        }
        System.out.println("Good day to you sirs."); //unnecesary but nevertheless nice to have
    }
}
