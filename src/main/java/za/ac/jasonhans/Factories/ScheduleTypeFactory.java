package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.Schedule;
import za.ac.jasonhans.Domain.ScheduleType;
import za.ac.jasonhans.FactoryInterfaces.ScheduleTypeFactoryInterface;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class ScheduleTypeFactory implements ScheduleTypeFactoryInterface{
    public ScheduleType createScheduleType( String code,
            String name,
            List<Schedule> schedules,
            boolean active)
    {
        return new ScheduleType.Builder(code)
                .name(name)
                .active(active)
                .schedules(schedules)
                .build();
    }
}
