package za.ac.jasonhans.Domain;

import za.ac.jasonhans.DomainInterfaces.IScheduleType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class ScheduleType implements Serializable, IScheduleType{
    private String code;
    private int scheduleTypeId;
    private String name;
    private boolean active;
    private List<Schedule> schedules;

    public ScheduleType(Builder value)
    {
        this.code = value.code;
        this.scheduleTypeId = value.scheduleTypeId;
        this.name = value.name;
        this.active = value.active;
        this.schedules = value.schedules;

    }

    @Override
    public List<Schedule> getSchedules() {
        return schedules;
    }

    public String getCode() {
        return code;
    }

    public int getScheduleTypeId() {
        return scheduleTypeId;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public static class Builder{
        String code;
        int scheduleTypeId;
        String name;
        boolean active;
        List<Schedule> schedules;

        public Builder(String code) {
            this.code = code;
        }

        public Builder scheduleTypeId(int scheduleTypeId) {
            this.scheduleTypeId = scheduleTypeId;
            return this;
        }

        public Builder schedules(List<Schedule> schedules) {
            this.schedules = schedules;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder copy(ScheduleType value)
        {
            this.code = value.code;
            this.scheduleTypeId = value.scheduleTypeId;
            this.name = value.name;
            this.active = value.active;

            return this;
        }

        public ScheduleType build()
        {
            return new ScheduleType(this);
        }
    }
}
