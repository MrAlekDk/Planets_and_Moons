package Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {


    @Test
    void planetAMoonOrbits(){

        //Arrange
        //String planetName = "Earth";
        Moon moon = new Moon("Moon","Earth");

        //Assert
        String planetBeingOrbited = moon.getOrbitedObject();

        //Assert
        assertEquals("Earth",planetBeingOrbited);

    }

}