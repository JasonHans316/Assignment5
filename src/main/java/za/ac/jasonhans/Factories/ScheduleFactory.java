package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.*;

/**
 * Created by Admin on 2016/04/03.
 */
public class ScheduleFactory {
    public static Schedule createSchedule(String activity,
                                          int scheduleId,
                                          DateTimeRange dtr)
    {
        return new Schedule.Builder(activity)
                .scheduleId(scheduleId)
                .dateTimeRange(dtr)
                .build();
    }

}
