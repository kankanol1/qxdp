package qxdp.project.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qxdp.project.userdao.User;
import qxdp.project.userdao.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addOne(User user){
        return this.userRepository.save(user);
    }

}
