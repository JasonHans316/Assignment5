package za.ac.jasonhans.Factories;

import za.ac.jasonhans.Domain.User;
import za.ac.jasonhans.Domain.UserRole;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class UserRoleFactory {
    public static UserRole createUserRole(int userRoleId,
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
