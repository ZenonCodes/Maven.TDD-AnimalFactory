package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        String givenName = "Milo";
        Dog dog = new Dog(null, null, null);


        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void testMammalInheritance() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 007;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Boolean actual = (dog instanceof Mammal);


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertTrue(actual);

    }
    @Test
    public void testAnimalInheritance() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 007;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Boolean actual = (dog instanceof Animal);


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertTrue(actual);

    }
    @Test
    public void testGetID() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 007;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        int expectedId = givenId;
        int actualId = dog.getId();


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertEquals(expectedId, actualId);

    }
    @Test
    public void testEatFood() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Food food = new Food();

        // When (we feed the dog)
        dog.eat(food);
        int mealsEaten = 1;
        int expectedMeals = dog.getNumberOfMealsEaten();


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertEquals(mealsEaten, expectedMeals);

    }


    @Test
    public void testSetBirthDate() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Date newBirthDate = new Date();
        dog.setBirthDate(newBirthDate);

        // When (we retrieve data from the dog)
        Date retrievedDate = dog.getBirthDate();


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertEquals(retrievedDate, newBirthDate);

    }
    @Test
    public void testSetName() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String newName = "Nacho";
        dog.setName(newName);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertEquals(newName, retrievedName);

    }
    @Test
    public void testDogSpeaks() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String expectedWord = "bark!";

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);


        // When (we retrieve data from the dog)
        String dogWord = dog.speak();


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertEquals(dogWord, expectedWord);

    }
    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
}
