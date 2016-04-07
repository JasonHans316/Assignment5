package za.ac.jasonhans.TestFactories;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.jasonhans.Domain.Adoption;
import za.ac.jasonhans.Domain.Animal;
import za.ac.jasonhans.Domain.Schedule;
import za.ac.jasonhans.Factories.AnimalFactory;
import za.ac.jasonhans.FactoryInterfaces.AnimalFactoryInterface;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class testAnimalFactory {

    @Test
    public void testCreate()
    {
        Adoption adoption = new Adoption.Builder("Peters Family").build();
        List<Schedule> schedules = null;
        AnimalFactoryInterface factory = new AnimalFactory();
        Animal original = factory.createAnimal("Sunshine", 13, 20.5, 3, adoption, schedules, "Dog");

        Assert.assertEquals(original.getAge(), 3);
    }


    @Test
    public void testUpdate()
    {
        Adoption adoption = new Adoption.Builder("Peters Family").build();
        List<Schedule> schedules = null;
        AnimalFactoryInterface factory = new AnimalFactory();
        Animal original = factory.createAnimal("Sunshine", 13, 20.5, 3, adoption, schedules, "Dog");
        Animal copy = new Animal.Builder("Sunshine").copy(original).age(4).build();

        Assert.assertEquals(original.getAge(), 3);
        Assert.assertEquals(copy.getAge(), 4);
        Assert.assertEquals(copy.getBreed(), original.getBreed());
    }

}
