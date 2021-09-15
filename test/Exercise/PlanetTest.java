package Exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @BeforeEach


    @Test
    void planetNameTestSucces(){

        //Arrange
        Planet earth = new Planet("Earth","Sun",1,93623581);


        //Act
        String nameOfPlanet = earth.getName();

        //Assert
        assertEquals("Earth",nameOfPlanet);

    }

    @Test
    void planetNameTestUnsuccesful(){
        //Arrange
        Planet earth = new Planet("Earth","Sun",1,93623581);

        //Act
        String nameOfPlanet = earth.getName();

        //Assert
        assertEquals("Earth",nameOfPlanet);

    }

    @Test
    void planetOrbitedObjectTest(){

        //Arrange
        Planet earth = new Planet("Earth","Sun",1,93623581);


        //Act
        String nameOfOrbitedObject = earth.getOrbitedObject();

        //Assert
        assertEquals("Sun",nameOfOrbitedObject);

    }

    @Test
    void countNumberOfMoonsForPlanet(){
        //Arrange
        Planet earth = new Planet("Earth","Sun",1,93623581);


        //Act
        int numberOfMoons = earth.getNumberOfMoons();

        //Assert
        assertEquals(1,numberOfMoons);
    }

    @Test
    void getDistanceFromSun(){
        //Arrange
        Planet earth = new Planet("Earth","Sun",1,93623581);


        //Act
        int distance = earth.getDistanceFromSun();

        //Assert
        assertEquals(93623581,distance);
    }

    @Test
    void calculateDistanceBetweenTwoPlanets(){
        //Arrange
        Planet earth = new Planet("Earth","Sun",1,93623581);
        Planet mars = new Planet("Mars","Sun",2,153303221);


        //Act
        int distance = mars.calculateDistance(earth.getDistanceFromSun());

        //Assert
        assertEquals(59679640,distance);
    }

    @Test
    void calculateDistanceBetweenTwoPlanets2(){
        //Arrange
        Planet earth = new Planet("Earth","Sun",1,93623581);
        Planet mars = new Planet("Mars","Sun",2,153303221);


        //Act
        int distance = earth.calculateDistance(mars.getDistanceFromSun());

        //Assert
        assertEquals(59679640,distance);
    }

}