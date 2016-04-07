package za.ac.jasonhans.FactoryInterfaces;

import za.ac.jasonhans.Domain.Schedule;
import za.ac.jasonhans.Domain.ScheduleType;

import java.util.List;

/**
 * Created by Hans Portable on 4/7/2016.
 */
public interface ScheduleTypeFactoryInterface {
    ScheduleType createScheduleType(String code,
                                    String name,
                                    List<Schedule> schedules,
                                    boolean active);
}
