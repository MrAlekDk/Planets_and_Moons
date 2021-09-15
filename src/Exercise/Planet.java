package Exercise;

public class Planet extends Orbital_Object{

    private int nrOfMoons;
    private int distanceFromSun;
    private int nrFromSun;


    public Planet(String planetName, String orbitedObject, int nrOfMoons, int nrFromSun, int distanceFromSun){
        super(planetName,orbitedObject);
        this.nrOfMoons = nrOfMoons;
        this.nrFromSun = nrFromSun;
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

    @Override
    public String toString(){
        return "nice";
    }

    public int getNumberFromSun() {
        return this.nrFromSun;
    }
}
