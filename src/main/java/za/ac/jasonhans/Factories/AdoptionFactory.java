package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.Adoption;
import za.ac.jasonhans.Domain.Animal;
import za.ac.jasonhans.Domain.User;

import java.util.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public class AdoptionFactory {
    public static Adoption createAdoption(String comment,
            int adoptionId,
            Date adoptionDate)
    {
        return new Adoption.Builder(comment)
                .adoptionDate(adoptionDate)
                .adoptionId(adoptionId)
                .build();
    }
}
