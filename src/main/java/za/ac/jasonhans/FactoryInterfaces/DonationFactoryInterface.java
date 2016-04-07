package za.ac.jasonhans.FactoryInterfaces;

import za.ac.jasonhans.Domain.Donation;

import java.sql.Date;

/**
 * Created by Hans Portable on 4/7/2016.
 */
public interface DonationFactoryInterface {
    Donation createDonation(
            Date donationDate,
            double amount,
            String comment);
}
