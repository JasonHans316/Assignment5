package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.Adoption;
import za.ac.jasonhans.Domain.Animal;
import za.ac.jasonhans.Domain.User;
import za.ac.jasonhans.FactoryInterfaces.AdoptionFactoryInterface;

import java.util.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public class AdoptionFactory implements AdoptionFactoryInterface{
    public Adoption createAdoption(String comment,
            Date adoptionDate)
    {
        return new Adoption.Builder(comment)
                .adoptionDate(adoptionDate)
                .build();
    }
}
