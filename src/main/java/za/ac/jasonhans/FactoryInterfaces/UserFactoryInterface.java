package za.ac.jasonhans.FactoryInterfaces;

import za.ac.jasonhans.Domain.Adoption;
import za.ac.jasonhans.Domain.Donation;
import za.ac.jasonhans.Domain.Schedule;
import za.ac.jasonhans.Domain.User;

import java.util.List;

/**
 * Created by Hans Portable on 4/7/2016.
 */
public interface UserFactoryInterface {
    User createUser(
            String name,
            String surname,
            String idNumber,
            List<Adoption> adoptions,
            List<Donation> donations,
            List<Schedule> schedules);
}
