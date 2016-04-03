package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.Schedule;
import za.ac.jasonhans.Domain.ScheduleType;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class ScheduleTypeFactory {
    public static ScheduleType createScheduleType( String code,
            int scheduleTypeId,
            String name,
            List<Schedule> schedules,
            boolean active)
    {
        return new ScheduleType.Builder(code)
                .name(name)
                .active(active)
                .scheduleTypeId(scheduleTypeId)
                .schedules(schedules)
                .build();
    }
}
