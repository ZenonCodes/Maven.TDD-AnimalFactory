package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    @Test
    public void testGetNumberOfCats(){
        //Given
        String name = "Lionus";
        Date birthDate = new Date();
        Cat lionus = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(lionus);


        //When
        int expectedCatCount = CatHouse.getNumberOfCats();
        int actualCatCount = 1;

        //Then
        Assert.assertEquals(actualCatCount, expectedCatCount);
    }

    @Test
    public void testGetById(){
        //Given
        String name = "Schmetterling";
        Date birthDate = new Date();
        Cat schmetterling = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(schmetterling);


        //When
        Cat expectedCat = schmetterling;
        int id = schmetterling.getId();
        Cat actualCat = CatHouse.getCatById(id);

        //Then
        Assert.assertEquals(expectedCat, actualCat);
    }
    @Test
    public void testAddCat(){
        //Given
        String name = "Schmetterling";
        Date birthDate = new Date();
        Cat firstPet = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        //When
        CatHouse.add(firstPet);
        int expectedOccupants = 1;
        int actualOccupants = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedOccupants, actualOccupants);
    }
    @Test
    public void testRemoveId(){
        //Given
        CatHouse.clear();

        //When
        String name = "Schmetterling";
        Date birthDate = new Date();
        Cat tempRes = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(tempRes);
        int expectedSize = 0;
        CatHouse.remove(tempRes.getId());
        int actualSize = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testRemoveCats(){
        //Given
        CatHouse.clear();

        //When
        String name = "Lionus";
        Date birthDate = new Date();
        Cat lionus = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(lionus);
        int expectedSize = 0;
        CatHouse.remove(lionus);
        int actualSize = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testGetNumberOfCats2() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }
}
