package za.ac.jasonhans.TestFactories;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.jasonhans.Domain.Adoption;
import za.ac.jasonhans.Factories.AdoptionFactory;

import java.util.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public class testAdoptionFactory {
    @Test
    public void testCreate()
    {
        AdoptionFactory factory = new AdoptionFactory();
        Adoption original = factory.createAdoption("First Dog", 0, new Date(2016,02,24));

        Assert.assertEquals(0, original.getAdoptionId());
    }

    @Test
    public void testUpdate()
    {
        AdoptionFactory factory = new AdoptionFactory();
        Adoption original = factory.createAdoption("First Dog", 0, new Date(2016,02,24));
        Adoption copy = new Adoption.Builder("New Dog").copy(original).adoptionId(5).build();

        Assert.assertEquals(0, original.getAdoptionId());
        Assert.assertEquals(5, copy.getAdoptionId());
        Assert.assertEquals(original.getAdoptionDate(), copy.getAdoptionDate());
    }
}
