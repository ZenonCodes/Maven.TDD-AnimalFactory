package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    @Test
    public void testGetNumberOfDogs2(){
        //Given
        String name = "Romi";
        Date birthDate = new Date();
        Dog romi = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(romi);


        //When
        int expectedDogCount = DogHouse.getNumberOfDogs();
        int actualDogCount = 1;

        //Then
        Assert.assertEquals(actualDogCount, expectedDogCount);
    }

    @Test
    public void testGetById(){
        //Given
        String name = "Romi";
        Date birthDate = new Date();
        Dog romi = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(romi);


        //When
        Dog expectedDog = romi;
        int id = romi.getId();
        Dog actualDog = DogHouse.getDogById(id);

        //Then
        Assert.assertEquals(expectedDog, actualDog);
    }
    @Test
    public void testAddDog(){
        //Given
        String name = "Romi";
        Date birthDate = new Date();
        Dog firstPet = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        //When
        DogHouse.add(firstPet);
        int expectedOccupants = 1;
        int actualOccupants = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedOccupants, actualOccupants);
    }
    @Test
    public void testRemoveId(){
        //Given
        DogHouse.clear();

        //When
        String name = "Romi";
        Date birthDate = new Date();
        Dog tempRes = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(tempRes);
        int expectedSize = 0;
        DogHouse.remove(tempRes.getId());
        int actualSize = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testRemoveDog(){
        //Given
        DogHouse.clear();

        //When
        String name = "Romi";
        Date birthDate = new Date();
        Dog romi = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(romi);
        int expectedSize = 0;
        DogHouse.remove(romi);
        int actualSize = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
