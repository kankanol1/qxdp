package qxdp.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import qxdp.project.dao.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    User getByUid(Integer uid);
    List<User> findByNameAndRole(String name, String role);
    List<User> findByNameLike(String name);

}
