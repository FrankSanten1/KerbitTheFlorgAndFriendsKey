import java.util.Arrays; //added by the student

public class Project2_Control {
    /*
    Project 2: Control
    - Learn how to access the elements in an array
    - Learn how to change individual elements in an array
    */
    public static void main(String[] args) {
        String[] actingOrder = {"Kerbit the Florg", "Ganzoo", "Mr. Piggy", "Aminal", "Fuzzy Bore", "Norwegian Chef", "Flask"};

        //Task 1: Print out the name of the merpet doing the third act in actingOrder. 
        //Remember that the third index will not necessarily give you the third item in an array.
        //Code here \/\/\/

        System.out.println(actingOrder[2]); //prints out third actor in actingOrder

        //Task 2: In the actingOrder array, switch out the value “Ganzoo” for “Small Bird”
        //Print out the resulting cast list
        //Code here \/\/\/

        actingOrder[1] = "Small Bird"; //changes Ganzoo to Small Bird
        System.out.println(Arrays.toString(actingOrder)); //prints out final cast list
    }
}

