package idoudi.hotelbooking.lakesidehotel.service;

import idoudi.hotelbooking.lakesidehotel.model.User;

import java.util.List;

/**
 * @author Simpson Alfred
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
