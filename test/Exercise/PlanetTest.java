package Exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @BeforeEach
    public void init() {
        Planet earth = new Planet("Earth", "Sun", 1,3, 93623581);
    }

    @Test
    void planetNameTestSucces() {

        //Arrange
        Planet earth = new Planet("Earth", "Sun", 1,3, 93623581);

        //Act
        String nameOfPlanet = earth.getName();

        //Assert
        assertEquals("Earth", nameOfPlanet);

    }

    @ParameterizedTest
    @ValueSource(ints =3)
    public void checkNumberFromSun(@ConvertWith(PlanetConverter.class) Planet planet){

        assertEquals(3,planet.getNumberFromSun());
    }

    @Test
    void planetNameTestUnsuccesful() {
        //Arrange
        Planet earth = new Planet("Earth", "Sun", 1,3, 93623581);

        //Act
        String nameOfPlanet = earth.getName();

        //Assert
        assertEquals("Earth", nameOfPlanet);

    }

    @Test
    void planetOrbitedObjectTest() {

        //Arrange
        Planet earth = new Planet("Earth", "Sun", 1,3, 93623581);


        //Act
        String nameOfOrbitedObject = earth.getOrbitedObject();

        //Assert
        assertEquals("Sun", nameOfOrbitedObject);

    }

    @Test
    void countNumberOfMoonsForPlanet() {
        //Arrange
        Planet earth = new Planet("Earth", "Sun", 1,3, 93623581);


        //Act
        int numberOfMoons = earth.getNumberOfMoons();

        //Assert
        assertEquals(1, numberOfMoons);
    }

    @Test
    void getDistanceFromSun() {
        //Arrange
        Planet earth = new Planet("Earth", "Sun", 1,3, 93623581);

        //Act
        int distance = earth.getDistanceFromSun();

        //Assert
        assertEquals(93623581, distance);
    }

    @Test
    void calculateDistanceBetweenTwoPlanets() {
        //Arrange
        Planet earth = new Planet("Earth", "Sun", 1,3, 93623581);
        Planet mars = new Planet("Mars", "Sun", 2,3, 153303221);


        //Act
        int distance = mars.calculateDistance(earth.getDistanceFromSun());

        //Assert
        assertEquals(59679640, distance);
    }

    @Test
    void calculateDistanceBetweenTwoPlanets2() {
        //Arrange
        Planet earth = new Planet("Earth", "Sun", 1,3, 93623581);
        Planet mars = new Planet("Mars", "Sun", 2,3, 153303221);


        //Act
        int distance = earth.calculateDistance(mars.getDistanceFromSun());

        //Assert
        assertEquals(59679640, distance);
    }

}