public class Project4_Preparation {
    /* 
    Project 4: Preparation
    - Learn how to access two arrays in the same loop
    - Practice the skills you’ve learned up to this point
    */
    public static void main(String[] args) {
        String[] cityNames = {"New York City", "Hong Kong", "London", "Cairo", "Buenos Aires"};
        int[] cityPopulation = {8468000, 7413000, 8982000, 9540000, 15370000};
        double[] cityDefenseRating = {5.3, 4.5, 6.2, 3.7, 5.4};

        String[] companyNames = {"Petro China", "Apple Inc.", "Saudi Aramco", "Amazon", "Walmart"}; 
        double[] companyNetWorths = {443000000000.0, 388000000000.0, 394000000000.0, 486000000000.0, 576000000000.0};

        //Task 1: Print out in the terminal an organized list of cities
        //Include their names, populations, defense ratings, and “Conquer ratings” 
        //Conquer rating is calculated by dividing population by defense
        //Code here \/\/\/

        for(int i = 0; i < cityNames.length; i++) { //cycles through all city indeces
            System.out.println("City: " + cityNames[i]); //prints name
            System.out.println("    Population: " + cityPopulation[i]); //prints population
            System.out.println("    Defense rating: " + cityDefenseRating[i]); //prints defense rating
            System.out.println("    Conquer rating: " + (cityPopulation[i] / cityDefenseRating[i])); //prints population / defense
        }

        //Task 2: Print each company with its net worth beside it
        //At the end, print out the company name with the largest net worth and recommend that it is attacked first. 
        //Have your code calculate which company has the highest net worth. Be as creative with your solution as you want.
        //Code here \/\/\/

        double biggestNetWorth = 0; //stores the highest net worth seen, starts low
        String biggestCompanyName = ""; //stores the name associated with the highest net worth
        for(int i = 0; i < companyNames.length; i++) { //loops through all companies
            System.out.println("Company name: " + companyNames[i]); //prints name
            System.out.println("    Net worth: $" + companyNetWorths[i]); //prints net worth
            if(companyNetWorths[i] > biggestNetWorth) { //checks if this net worth is bigger than the previous last biggest
                biggestNetWorth = companyNetWorths[i]; //if it is bigger, replace the previous biggest with the current amount
                biggestCompanyName = companyNames[i]; //get the name associated with that net worth
            } //if it's smaller than the last biggest, then just leave it all be
        }
        System.out.println("Recommended company to sabotage first: " + biggestCompanyName); //after all have been considered, print the one that had the highest net worth and recommend to be destroyed first. 
    }
}
