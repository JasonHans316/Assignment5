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
public class TestAdoptionFactory {
    @Test
    public void testCreate()
    {
        AdoptionFactoryInterface factory = new AdoptionFactory();
        Adoption original = factory.createAdoption("First Dog", new Date(2016,02,24));

        Assert.assertEquals(new Date(2016,02,24), original.getAdoptionDate());
    }

    @Test
    public void testUpdate()
    {
        AdoptionFactoryInterface factory = new AdoptionFactory();
        Adoption original = factory.createAdoption("First Dog", new Date(2016,02,24));
        Adoption copy = new Adoption.Builder("New Dog").copy(original).adoptionDate(new Date(2016,04,06)).build();

        Assert.assertEquals(new Date(2016,02,24), original.getAdoptionDate());
        Assert.assertEquals(new Date(2016,04,06), copy.getAdoptionDate());
        Assert.assertNotEquals(original.getAdoptionDate(), copy.getAdoptionDate());
    }
}
