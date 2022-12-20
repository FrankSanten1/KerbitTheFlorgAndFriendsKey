public class Project6_Domination {
    /*
    Project 6: Domination
    - Learn how to initialize arrays of objects
    - Learn how to call methods of objects in an array
    */
    public static void main(String[] args) {
        City[] citiesOwned = {new City("Buenos Aires", 15370000, 1.2, 0.9, 1, "Horacio Rodríguez Larreta"), 
        new City("New York City", 8468000, 0.8, 1, 1.2, "Eric Adams"), 
        new City("Cairo", 9540000, 1, 1.2, 0.95, "Abdel Fattah el-Sisi")};

        //Task 1: Using the installRuler() method, manually install different merpets as the rulers of all the continents.
        //Code here \/\/\/

        citiesOwned[0].installRuler("Kerbit the Florg"); //replace buenos aires' ruler with kerbit
        citiesOwned[1].installRuler("Small Bird"); //replace NYC's ruler with small bird
        citiesOwned[2].installRuler("Mr. Piggy"); //replace Cairo's ruler with Mr. Piggy
        //also all of them inflict a little fear

        //Task 2: Check every continent’s fear variable using the getFear() method and a for loop. 
        //If fear is below 1.5, use the instillFear method to destroy a bit of infrastructure in exchange for a lot more fear. 
        //Print out the stats of the city afterward using the displayStats function
        //Code here \/\/\/

        for(int i = 0; i < citiesOwned.length; i++) { //goes through each city
            if(citiesOwned[i].getFear() < 1.5) { //if their fear isn't high enough
                citiesOwned[i].instillFear(); //desrtoy some infrastructure to get the fear up
            }
            citiesOwned[i].displayStats(); //display this city's stats
        }
    }
}