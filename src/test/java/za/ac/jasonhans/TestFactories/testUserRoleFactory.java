package za.ac.jasonhans.TestFactories;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.jasonhans.Domain.User;
import za.ac.jasonhans.Domain.UserRole;
import za.ac.jasonhans.Factories.UserFactory;
import za.ac.jasonhans.Factories.UserRoleFactory;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class testUserRoleFactory {
    @Test
    public void testCreate()
    {
        UserRoleFactory factory = new UserRoleFactory();
        List<User> users = null;
        UserRole original = factory.createUserRole(0, "Jason", "JH", users, true);

        Assert.assertEquals("JH", original.getCode());
    }

    @Test
    public void testUpdate()
    {
        UserRoleFactory factory = new UserRoleFactory();
        List<User> users = null;
        UserRole original = factory.createUserRole(0, "Jason", "JH", users, true);
        UserRole copy  = new UserRole.Builder("Steve").copy(original).code("SR").build();

        Assert.assertEquals("JH", original.getCode());
        Assert.assertEquals("SR", copy.getCode());
        Assert.assertEquals(original.isActive(), copy.isActive());
    }
}
