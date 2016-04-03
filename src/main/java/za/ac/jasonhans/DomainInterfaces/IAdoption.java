package za.ac.jasonhans.DomainInterfaces;

import za.ac.jasonhans.Domain.Animal;
import za.ac.jasonhans.Domain.User;

import java.util.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public interface IAdoption {
    String getComment();
    int getAdoptionId();
    Date getAdoptionDate();
}
