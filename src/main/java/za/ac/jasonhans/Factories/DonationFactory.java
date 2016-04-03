package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.Donation;
import za.ac.jasonhans.Domain.User;

import java.sql.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public class DonationFactory {
    public static Donation createDonation(int donationId,
            Date donationDate,
            double amount,
            String comment)
    {
        return new Donation.Builder(donationDate)
                .amount(amount)
                .comment(comment)
                .donationId(donationId)
                .build();
    }
}
