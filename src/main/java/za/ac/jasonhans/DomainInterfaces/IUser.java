package za.ac.jasonhans.DomainInterfaces;

import za.ac.jasonhans.Domain.Adoption;
import za.ac.jasonhans.Domain.Donation;
import za.ac.jasonhans.Domain.Schedule;
import za.ac.jasonhans.Domain.UserRole;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public interface IUser {
    Long getUserId();
    String getName();
    String getSurname();
    String getIdNumber();
    List<Donation> getDonations();
    List<Schedule> getSchedules();
    List<Adoption> getAdoptions();
}
