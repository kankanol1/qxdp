
package qxdp.project.service;

import qxdp.project.dao.User;

import java.util.List;

public interface UserService {
    public User saveOne(User user);
    public User findOne(Integer uid);
    public List<User> saveAll(List<User> users);
    public List<User> getUserByNameAndRole(String name,String role);
    public List<User> getUserByNameLike(String name);
}
