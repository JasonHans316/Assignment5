package za.ac.jasonhans.TestFactories;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.jasonhans.Domain.DateTimeRange;
import za.ac.jasonhans.Domain.Schedule;
import za.ac.jasonhans.Factories.ScheduleFactory;
import za.ac.jasonhans.FactoryInterfaces.ScheduleFactoryInterface;

/**
 * Created by Admin on 2016/04/03.
 */
public class TestScheduleFactory {

    @Test
    public void testCreate()
    {
        ScheduleFactoryInterface factory = new ScheduleFactory();
        Schedule testObject = factory.createSchedule("Bathing", new DateTimeRange());

        Assert.assertEquals("Bathing", testObject.getActivity());
    }

    @Test
    public void testUpdate()
    {
        ScheduleFactoryInterface factory = new ScheduleFactory();
        Schedule original = factory.createSchedule("Bathing", new DateTimeRange());
        Schedule copy = new Schedule.Builder("Feeding").copy(original).build();

        Assert.assertEquals("Bathing", original.getActivity());
        Assert.assertEquals("Feeding", copy.getActivity());

    }
}
