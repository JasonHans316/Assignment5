package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.Animal;
import za.ac.jasonhans.Domain.LivingArea;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class LivingAreaFactory {
    public static LivingArea createLivingArea(int livingAreaId,
            String name,
            String code,
            boolean active,
            int spaceAvailable,
            List<Animal> animals){
        return new LivingArea.Builder(name)
                .code(code)
                .active(active)
                .livingAreaId(livingAreaId)
                .spaceAvailable(spaceAvailable)
                .animals(animals)
                .build();
    }
}
