package za.ac.jasonhans.DomainInterfaces;

import za.ac.jasonhans.Domain.DateTimeRange;


/**
 * Created by Admin on 2016/04/03.
 */
public interface ISchedule {
    String getActivity();
    Long getScheduleId();
    DateTimeRange getDtr();
}
