package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.*;
import za.ac.jasonhans.FactoryInterfaces.UserFactoryInterface;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class UserFactory implements UserFactoryInterface{
    public User createUser(
            String name,
            String surname,
            String idNumber,
            List<Adoption>adoptions,
            List<Donation> donations,
            List<Schedule> schedules)
    {
        return new User.Builder(name)
                .idNumber(idNumber)
                .surname(surname)
                .adoptions(adoptions)
                .donations(donations)
                .schedules(schedules)
                .build();
    }
}
