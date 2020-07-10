package qxdp.project.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import qxdp.project.dao.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByUid(Integer uid);
    User deleteUserByUid(Integer uid);
    List<User> findUserByNameAndRole(String name, String role);
    List<User> findUserByNameAndRoleAndPassword(String name, String role,String password);
    List<User> findUserByNameLike(String name,Pageable pageable);

}
