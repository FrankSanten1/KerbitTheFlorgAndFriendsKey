import java.util.Arrays; //added by the student

public class Project1_Inception {
    /*
    Project 1: Inception
    - Learn what an array is
    - Learn how to create an empty array
    - Learn how to print an array
    - Learn how to create an array with preset values
     */

    public static void main(String[] args) {
        //Task 1: Create an array of integers that is 4 values long
        //Code here \/\/\/

        int[] myFirstArray = new int[4]; //creates an array of 4 zeros

        //Task 2: Print out the array that you initialized in Task 1 using Arrays.toString
        //Remember to import it at the very top of the code, or else it will not work
        //Code here \/\/\/

        System.out.println(Arrays.toString(myFirstArray)); //prints said array of 4 zeros

        //Task 3: Create an array of strings named castList containing the names of the cast of Kerbit the Florg and Friends
        //Include at least five names, and print out the array afterward.
        // (there are no specifically required names here, just put 5 off-brand sounding names of muppets into an array)
        //Code here \/\/\/
        
        String[] castList = {"these", "can", "be", "any", "names"}; //just needs to be a string array 5 long basically
        System.out.println(Arrays.toString(castList)); //prints the array
    }
}