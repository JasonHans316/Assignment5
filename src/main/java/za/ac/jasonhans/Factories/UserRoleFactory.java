package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.User;
import za.ac.jasonhans.Domain.UserRole;
import za.ac.jasonhans.FactoryInterfaces.UserRoleFactoryInterface;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class UserRoleFactory implements UserRoleFactoryInterface{
    public UserRole createUserRole(
            String name,
            String code,
            List<User> users,
            boolean active)
    {
        return new UserRole.Builder(name)
                .code(code)
                .active(active)
                .users(users)
                .build();
    }
}
