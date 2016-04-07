package za.ac.jasonhans.FactoryInterfaces;

import za.ac.jasonhans.Domain.Adoption;

import java.util.Date;

/**
 * Created by Hans Portable on 4/7/2016.
 */
public interface AdoptionFactoryInterface {
    Adoption createAdoption(String comment, Date adoptionDate);
}
