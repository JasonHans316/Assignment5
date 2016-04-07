package za.ac.jasonhans.TestFactories;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.jasonhans.Domain.Donation;
import za.ac.jasonhans.Factories.DonationFactory;
import za.ac.jasonhans.FactoryInterfaces.DonationFactoryInterface;

import java.sql.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public class testDonationFactory {
    @Test
    public void testCreate()
    {
        DonationFactoryInterface factory = new DonationFactory();
        Donation original = factory.createDonation( new Date(2016,2,5),500.14, "For Food");

        Assert.assertEquals(500.14, original.getAmount());
    }

    @Test
    public void testUpdate()
    {
        DonationFactoryInterface factory = new DonationFactory();
        Donation original = factory.createDonation( new Date(2016,2,5),500.14, "For Food");
        Donation copy = new Donation.Builder(new Date(2016,3,4)).copy(original).amount(300.67).build();
        Assert.assertEquals(500.14, original.getAmount());
        Assert.assertEquals(300.67, copy.getAmount());

    }
}
