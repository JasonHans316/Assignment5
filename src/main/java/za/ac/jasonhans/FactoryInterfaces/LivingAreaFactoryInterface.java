package za.ac.jasonhans.FactoryInterfaces;

import za.ac.jasonhans.Domain.Animal;
import za.ac.jasonhans.Domain.LivingArea;

import java.util.List;

/**
 * Created by Hans Portable on 4/7/2016.
 */
public interface LivingAreaFactoryInterface {
    LivingArea createLivingArea(
            String name,
            String code,
            boolean active,
            int spaceAvailable,
            List<Animal> animals);
}
