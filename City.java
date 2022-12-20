public class City {
    // !!!THIS IS NOT A DOCUMENT YOU NEED TO EDIT!!!
    //This is a class for project 6. You do not need to change anything in this file, nor should you. 
    //However, you should probably look at this file so that you can understand what the methods are and what they can do.
    //Anyway, enjoy the City class!

    String cityName; //Holds the name of the city
    int population; //How many people live there
    double fear; //How afraid the population is of their leader
    double infrastructure; //How well the infrastructure works
    double productivity; //How hard-working every citizen is
    String cityLeader; //Name of the leader of the city

    public City(String cityNameInp, int populationInp, double fearInp, double infrastructureInp, double productivityInp, String cityLeaderInp) { //constructor:
        cityName = cityNameInp; //sets all the values
        population = populationInp;
        fear = fearInp;
        infrastructure = infrastructureInp;
        productivity = productivityInp;
        cityLeader = cityLeaderInp;
    }

    //Getters and setters for posterity
    //Getters for getting the stats
    public String getCityName() {return cityName;}
    public int getPopulation() {return population;}
    public double getFear() {return fear;}
    public double getInfrastructure() {return infrastructure;}
    public double getProductivity() {return productivity;}
    public String getCityLeader() {return cityLeader;}

    //Setters not really meant to be used, but are here for debug
    public void setCityName(String cityNameInp) {cityName = cityNameInp;}
    public void setPopulation(int populationInp) {population = populationInp;}
    public void setFear(double fearInp) {fear = fearInp;}
    public void setInfrastructure(double infrastructureInp) {infrastructure = infrastructureInp;}
    public void setProductivity(double productivityInp) {productivity = productivityInp;}
    public void setCityLeader(String cityLeaderInp) {cityLeader = cityLeaderInp;}

    //Fun functions:
    public void installRuler(String newMerpetLeader) { //Make a glorious new reign
        cityLeader = newMerpetLeader;
        fear *= 1.4;
        productivity *= 1.1;
    }

    public void instillFear() { //Destroy a bot of infrastructure so the people know you mean business
        infrastructure *= 0.9;
        fear *= 1.75;
    }

    public void disciplineInitiative() { //Makes the citizens better, but more likely to depose you
        productivity *= 1.2;
        fear *= 0.9;
    }

    public void rebuild() { //Makes the city much more effective, but the people start to get comfortable
        infrastructure *= 1.5;
        productivity *= 1.2;
        fear *= 0.8;
    }

    public void unskilledLabor() { //Ship in more unskilled labor, adding to population but decreasing overall productivity
        population *= 1.2;
        productivity *= 0.8;
    }

    public void fundGamingYacht() { //every leader needs a gaming yacht! use your city to fund a new one
        double yachtPrice = population * productivity * infrastructure * fear;
        System.out.println(cityLeader + " was able to fund a gaming yacht worth $" + yachtPrice + "!");
    }

    public void policeState() { //Put some of the population in chains so that the rest can work better without them
        population *= 0.9;
        productivity *= 1.2;
    }

    public void displayStats() { //simple display of all stats that the city has
        System.out.println("Name of city: " + cityName);
        System.out.println("    Name of ruler: " + cityLeader);
        System.out.println("    Population: " + population);
        System.out.println("    Fear rating: " + fear);
        System.out.println("    Infrastructure rating: " + infrastructure);
        System.out.println("    Productivity rating: " + productivity);
    }
}
