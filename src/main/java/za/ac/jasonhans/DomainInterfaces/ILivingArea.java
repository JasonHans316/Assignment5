package za.ac.jasonhans.DomainInterfaces;

import za.ac.jasonhans.Domain.Animal;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public interface ILivingArea {
    int getLivingAreaId();
    String getName();
    String getCode();
    boolean isActive();
    int getSpaceAvailable();
    List<Animal> getAnimals();

}
