package qxdp.project.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qxdp.project.dao.User;
import qxdp.project.repository.UserRepository;
import qxdp.project.service.UserService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Transactional
    @Override
    public User saveOne(User user){
        return userRepository.save(user);
    }

    public User findOne(Integer uid){
        return userRepository.findUserByUid(uid);
    }

    public User deleteOne(Integer uid){
        return userRepository.deleteUserByUid(uid);
    }

    public User updateOne(User user){
        return userRepository.save(user);
    }

    public List<User> saveAll(List<User> users){
        return userRepository.saveAll(users);
    }

    public List<User> getUserByNameAndRole(String name,String role){

        return userRepository.findUserByNameAndRole(name, role);
    }

    public List<User> getUserByNameLike(String name, Pageable pageable){
        return userRepository.findUserByNameLike(name,pageable);
    }

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("UserService");
    EntityManager em = emf.createEntityManager();


    public User createEmployee(String name, String role, String password) {


        User emp = new User();
        emp.setName(name);
        emp.setDate(new Date());
        emp.setRole(role);
        emp.setPassword(password);
        em.persist(emp);
        return emp;
    }

}
