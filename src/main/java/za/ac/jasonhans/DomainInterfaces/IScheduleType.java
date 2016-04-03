package za.ac.jasonhans.DomainInterfaces;

import za.ac.jasonhans.Domain.Schedule;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public interface IScheduleType {
    String getCode();
    int getScheduleTypeId();
    String getName();
    boolean isActive();
    List<Schedule> getSchedules();
}
