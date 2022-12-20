public class Project5_Conquest {
    /*
    Project 5: Conquest
    - Learn what an enhanced for loop is, and how to use it
    - Learn the pros and cons of enhanced for loops vs. iteration
    */
    public static void main(String[] args) {
        String[] citiesConquered = {"Buenos Aires", "New York City", "Cairo"};
        int[] citiesConqueredPopulation = {15370000, 8468000, 9540000};

        //Task 1: Use an enhanced for loop to print out every value of citiesConquered.
        //Code here \/\/\/

        for(String x : citiesConquered) { //very simple enhanced for loop, runs through all cities
            System.out.println("Conquered: " + x); //prints all cities out
        }

        //Task 2: Use an enhanced for loop to add all population values to a running total and print it out at the end. 
        //Code here \/\/\/

        int totalPopulation = 0; //will be added to after every loop
        for(int x : citiesConqueredPopulation) { //goes through every city conquered
            totalPopulation += x; //adds the pop of that city to the running total
        }
        System.out.println("Total population conquered: " + totalPopulation); //prints out resulting final pop at the end
    }
}
