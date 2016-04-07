package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.*;
import za.ac.jasonhans.FactoryInterfaces.ScheduleFactoryInterface;

/**
 * Created by Admin on 2016/04/03.
 */
public class ScheduleFactory implements ScheduleFactoryInterface{
    public Schedule createSchedule(String activity,
                                          DateTimeRange dtr)
    {
        return new Schedule.Builder(activity)
                .dateTimeRange(dtr)
                .build();
    }

}
