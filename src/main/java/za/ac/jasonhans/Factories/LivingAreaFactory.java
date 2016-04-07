package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.Animal;
import za.ac.jasonhans.Domain.LivingArea;
import za.ac.jasonhans.FactoryInterfaces.LivingAreaFactoryInterface;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class LivingAreaFactory implements LivingAreaFactoryInterface{
    public LivingArea createLivingArea(
            String name,
            String code,
            boolean active,
            int spaceAvailable,
            List<Animal> animals){
        return new LivingArea.Builder(name)
                .code(code)
                .active(active)
                .spaceAvailable(spaceAvailable)
                .animals(animals)
                .build();
    }
}
