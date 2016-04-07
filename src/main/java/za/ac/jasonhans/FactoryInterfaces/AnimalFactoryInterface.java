package za.ac.jasonhans.FactoryInterfaces;

import za.ac.jasonhans.Domain.Adoption;
import za.ac.jasonhans.Domain.Animal;
import za.ac.jasonhans.Domain.Schedule;

import java.util.List;

/**
 * Created by Hans Portable on 4/7/2016.
 */
public interface AnimalFactoryInterface {
    Animal createAnimal(String name,
                        int spaceRequired,
                        double weight,
                        int age,
                        Adoption adoption,
                        List<Schedule> schedules,
                        String breed);
}
