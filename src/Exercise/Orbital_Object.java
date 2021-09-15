package Exercise;

public abstract class Orbital_Object {

    private String name;
    private String orbitedObject;

    public Orbital_Object(String planetName, String orbitedObject) {
        this.name = planetName;
        this.orbitedObject = orbitedObject;
    }


    public String getName(){
        return this.name;
    }

    public String getOrbitedObject(){
        return this.orbitedObject;
    }
}
