package za.ac.jasonhans.TestFactories;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.jasonhans.Domain.Adoption;
import za.ac.jasonhans.Domain.Donation;
import za.ac.jasonhans.Domain.Schedule;
import za.ac.jasonhans.Domain.User;
import za.ac.jasonhans.Factories.UserFactory;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class testUserFactory {

    @Test
    public void testCreate()
    {
        List<Donation> donations = null;
        List<Schedule> schedules = null;
        List<Adoption> adoptions = null;
        UserFactory factory = new UserFactory();

        User original = factory.createUser(0, "Jason", "Hans", "9405142354788", adoptions, donations, schedules);

        Assert.assertEquals("Hans", original.getSurname());
    }

    @Test
    public void testUpdate()
    {
        List<Donation> donations = null;
        List<Schedule> schedules = null;
        List<Adoption> adoptions = null;
        UserFactory factory = new UserFactory();

        User original = factory.createUser(0, "Jason", "Hans", "9405142354788", adoptions, donations, schedules);
        User copy = new User.Builder("Kyle").copy(original).surname("Stevens").build();

        Assert.assertEquals("Hans", original.getSurname());
        Assert.assertEquals("Stevens", copy.getSurname());
        Assert.assertEquals(copy.getIdNumber(), original.getIdNumber());

    }
}
