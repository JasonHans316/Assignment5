package za.ac.jasonhans.FactoryInterfaces;

import za.ac.jasonhans.Domain.DateTimeRange;
import za.ac.jasonhans.Domain.Schedule;

/**
 * Created by Hans Portable on 4/7/2016.
 */
public interface ScheduleFactoryInterface {
    Schedule createSchedule(String activity,
                            DateTimeRange dtr);
}
