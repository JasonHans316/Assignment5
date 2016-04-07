package za.ac.jasonhans.TestFactories;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.jasonhans.Domain.Adoption;
import za.ac.jasonhans.Factories.AdoptionFactory;
import za.ac.jasonhans.FactoryInterfaces.AdoptionFactoryInterface;

import java.util.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public class testAdoptionFactory {
    @Test
    public void testCreate()
    {
        AdoptionFactoryInterface factory = new AdoptionFactory();
        Adoption original = factory.createAdoption("First Dog", new Date(2016,02,24));

        Assert.assertEquals("First Dog", original.getComment());
    }

    @Test
    public void testUpdate()
    {
        AdoptionFactoryInterface factory = new AdoptionFactory();
        Adoption original = factory.createAdoption("First Dog", new Date(2016,02,24));
        Adoption copy = new Adoption.Builder("New Dog").copy(original).build();

        Assert.assertEquals("First Dog", original.getComment());
        Assert.assertEquals("First Dog", copy.getComment());
        Assert.assertEquals(original.getAdoptionDate(), copy.getAdoptionDate());
    }
}
