package za.ac.jasonhans.DomainInterfaces;

import za.ac.jasonhans.Domain.User;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public interface IUserRole {
    int getUserRoleId();
    String getName();
    String getCode();
    boolean isActive();
    List<User> getUsers();
}
