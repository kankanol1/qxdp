package qxdp.project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import qxdp.project.dao.User;
import qxdp.project.impl.UserServiceImpl;

import java.util.Date;

@SpringBootTest
class QxdpWebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void jpatest() {
        UserServiceImpl userRepository;
        User user = new User("kankan", "admin", new Date(), "kankan");
    }
}
