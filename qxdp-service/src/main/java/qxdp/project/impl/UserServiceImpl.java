package qxdp.project.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qxdp.project.dao.User;
import qxdp.project.repository.UserRepository;
import qxdp.project.service.UserService;

import javax.transaction.Transactional;
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
        return userRepository.getByUid(uid);
    }

    public List<User> saveAll(List<User> users){
        return userRepository.saveAll(users);
    }

    public List<User> getUserByNameAndRole(String name,String role){

        return userRepository.findByNameAndRole(name, role);
    }

    public List<User> getUserByNameLike(String name){
        return userRepository.findByNameLike(name);
    }

}
