package Exercise;

public class Planet extends Orbital_Object{

    private int nrOfMoons;
    private int distanceFromSun;


    public Planet(String planetName, String orbitedObject, int nrOfMoons,int distanceFromSun){
        super(planetName,orbitedObject);
        this.nrOfMoons = nrOfMoons;
        this.distanceFromSun = distanceFromSun;
    }

    public int getNumberOfMoons(){
        return this.nrOfMoons;
    }

    public int getDistanceFromSun() {
        return this.distanceFromSun;
    }

    public int calculateDistance(int distanceFromSun) {
        return Math.abs((this.distanceFromSun-distanceFromSun));
    }
}
