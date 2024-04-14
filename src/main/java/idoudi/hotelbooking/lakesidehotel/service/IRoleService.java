package idoudi.hotelbooking.lakesidehotel.service;

import idoudi.hotelbooking.lakesidehotel.model.Role;
import idoudi.hotelbooking.lakesidehotel.model.User;

import java.util.List;


public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
