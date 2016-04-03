package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.Adoption;
import za.ac.jasonhans.Domain.Animal;
import za.ac.jasonhans.Domain.Schedule;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class AnimalFactory {
    public static Animal createAnimal(String name,
            int animalId,
            int spaceRequired,
            double weight,
            int age,
            Adoption adoption,
            List<Schedule> schedules,
            String breed)
    {
        return new Animal.Builder(name)
                .animalId(animalId)
                .age(age)
                .spaceRequired(spaceRequired)
                .weight(weight)
                .breed(breed)
                .adoption(adoption)
                .schedules(schedules)
                .build();
    }
}
