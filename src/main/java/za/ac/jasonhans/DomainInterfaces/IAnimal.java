package za.ac.jasonhans.DomainInterfaces;

import za.ac.jasonhans.Domain.Adoption;
import za.ac.jasonhans.Domain.Schedule;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public interface IAnimal {
    String getName();
    Long  getAnimalId();
    int getSpaceRequired();
    double getWeight();
    int getAge();
    String getBreed();
    List<Schedule> getSchedules();
    Adoption getAdoption();
}
