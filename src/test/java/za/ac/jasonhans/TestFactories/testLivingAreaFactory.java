package za.ac.jasonhans.TestFactories;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.jasonhans.Domain.Animal;
import za.ac.jasonhans.Domain.LivingArea;
import za.ac.jasonhans.Factories.LivingAreaFactory;
import za.ac.jasonhans.FactoryInterfaces.LivingAreaFactoryInterface;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class testLivingAreaFactory {
    @Test
    public void testCreate()
    {
        List<Animal> animals = null;
        LivingAreaFactoryInterface factory = new LivingAreaFactory();
        LivingArea original = factory.createLivingArea("Kennels", "KS", true, 50, animals);

        Assert.assertEquals(50, original.getSpaceAvailable());
    }

    @Test
    public void testUpdate()
    {
        List<Animal> animals = null;
        LivingAreaFactoryInterface factory = new LivingAreaFactory();
        LivingArea original = factory.createLivingArea("Kennels", "KS", true, 50, animals);
        LivingArea copy = new LivingArea.Builder("Cages").copy(original).spaceAvailable(45).build();

        Assert.assertEquals(45, copy.getSpaceAvailable());
        Assert.assertEquals(50, original.getSpaceAvailable());
        Assert.assertEquals(original.getName(), copy.getName());
    }

}
