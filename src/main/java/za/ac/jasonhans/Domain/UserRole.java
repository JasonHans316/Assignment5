package za.ac.jasonhans.Domain;
//import javax.persistence.*;

import za.ac.jasonhans.DomainInterfaces.IUserRole;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */

public class UserRole implements Serializable, IUserRole{

    private int userRoleId;
    private String name;
    private String code;
    private boolean active;
    private List<User> users;

    public UserRole(Builder value)
    {
        this.active = value.active;
        this.name = value.name;
        this.code = value.code;
        this.userRoleId = value.userRoleId;
        this.users = value.users;
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<User> getUsers()
    {
        return users;
    }

    public boolean isActive() {
        return active;
    }

    public static class Builder{
        int userRoleId;
        String name;
        String code;
        boolean active;
        List<User> users;

        public Builder (String name) {
            this.name = name;
        }

        public Builder userRoleId(int userRoleId) {
            this.userRoleId = userRoleId;
            return this;
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder users(List<User> users) {
            this.users = users;
            return this;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder copy(UserRole value){
            this.active = value.active;
            this.name = value.name;
            this.code = value.code;
            this.userRoleId = value.userRoleId;
            return this;
        }

        public UserRole build()
        {
            return new UserRole(this);
        }
    }
}
