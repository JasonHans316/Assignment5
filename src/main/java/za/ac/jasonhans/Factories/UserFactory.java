package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.*;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class UserFactory {
    public static User createUser(int userId,
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
                .userId(userId)
                .adoptions(adoptions)
                .donations(donations)
                .schedules(schedules)
                .build();
    }
}
