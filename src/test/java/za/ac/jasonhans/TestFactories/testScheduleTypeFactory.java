package za.ac.jasonhans.TestFactories;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.jasonhans.Domain.Schedule;
import za.ac.jasonhans.Domain.ScheduleType;
import za.ac.jasonhans.Factories.ScheduleTypeFactory;
import za.ac.jasonhans.FactoryInterfaces.ScheduleTypeFactoryInterface;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class TestScheduleTypeFactory {
    @Test
    public void testCreate()
    {
        List<Schedule> schedules = null;
        ScheduleTypeFactoryInterface factory = new ScheduleTypeFactory();
        ScheduleType original = factory.createScheduleType("LOL", "Steven", schedules,true);

        Assert.assertEquals("LOL", original.getCode());
    }

    @Test
    public void testUpdate()
    {
        List<Schedule> schedules = null;
        ScheduleTypeFactoryInterface factory = new ScheduleTypeFactory();
        ScheduleType original = factory.createScheduleType("LOL", "Steven", schedules,true);
        ScheduleType copy = new ScheduleType.Builder("IDK").copy(original).active(false).build();

        Assert.assertEquals(false, copy.isActive());
        Assert.assertEquals(true, original.isActive());
        Assert.assertEquals(original.getName(), copy.getName());
    }
}
