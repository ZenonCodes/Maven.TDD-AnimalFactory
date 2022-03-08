package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    @Test
    public void testMammalInheritance() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 007;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Boolean actual = (cat instanceof Mammal);


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertTrue(actual);

    }
    @Test
    public void testAnimalInheritance() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 007;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Boolean actual = (cat instanceof Animal);


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertTrue(actual);

    }
    @Test
    public void testGetID() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 007;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        int expectedId = givenId;
        int actualId = cat.getId();


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertEquals(expectedId, actualId);

    }
    @Test
    public void testEatFood() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food food = new Food("CatChow");

        // When (we feed the cat)
         cat.eat(food);
         int mealsEaten = 1;
         int expectedMeals = cat.getNumberOfMealsEaten();


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertEquals(mealsEaten, expectedMeals);

    }


    @Test
    public void testSetBirthDate() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Date newBirthDate = new Date();
        cat.setBirthDate(newBirthDate);

        // When (we retrieve data from the cat)
        Date retrievedDate = cat.getBirthDate();


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertEquals(retrievedDate, newBirthDate);

    }
    @Test
    public void testSetName() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String newName = "Nacho";
        cat.setName(newName);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertEquals(newName, retrievedName);

    }
    @Test
    public void testCatSpeaks() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String expectedWord = "meow!";

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        // When (we retrieve data from the cat)
        String catWord = cat.speak();


        // Then (we expect the new data, to match the retrieved data)
        Assert.assertEquals(catWord, expectedWord);

    }
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
