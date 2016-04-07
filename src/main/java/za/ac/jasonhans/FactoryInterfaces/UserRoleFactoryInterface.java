package za.ac.jasonhans.FactoryInterfaces;

import za.ac.jasonhans.Domain.User;
import za.ac.jasonhans.Domain.UserRole;

import java.util.List;

/**
 * Created by Hans Portable on 4/7/2016.
 */
public interface UserRoleFactoryInterface {
    UserRole createUserRole(
            String name,
            String code,
            List<User> users,
            boolean active);
}
