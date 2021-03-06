package za.ac.jasonhans.TestFactories;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.jasonhans.Domain.Schedule;
import za.ac.jasonhans.Domain.ScheduleType;
import za.ac.jasonhans.Factories.ScheduleTypeFactory;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class testScheduleTypeFactory {
    @Test
    public void testCreate()
    {
        List<Schedule> schedules = null;
        ScheduleTypeFactory factory = new ScheduleTypeFactory();
        ScheduleType original = factory.createScheduleType("LOL", 0, "Steven", schedules,true);

        Assert.assertEquals("LOL", original.getCode());
    }

    @Test
    public void testUpdate()
    {
        List<Schedule> schedules = null;
        ScheduleTypeFactory factory = new ScheduleTypeFactory();
        ScheduleType original = factory.createScheduleType("LOL", 0, "Steven", schedules,true);
        ScheduleType copy = new ScheduleType.Builder("IDK").copy(original).active(false).build();

        Assert.assertEquals(false, copy.isActive());
        Assert.assertEquals(true, original.isActive());
        Assert.assertEquals(original.getName(), copy.getName());
    }
}
