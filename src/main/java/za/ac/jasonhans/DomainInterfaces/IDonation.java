package za.ac.jasonhans.DomainInterfaces;

import za.ac.jasonhans.Domain.User;

import java.sql.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public interface IDonation {
    Date getDonationDate();
    Long getDonationId();
    double getAmount();
    String getComment();
}
