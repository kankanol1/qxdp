package qxdp.project.controller.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import qxdp.project.userdao.User;
import qxdp.project.userservice.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/add")
    private User add(@RequestParam(name="name") String name,@RequestParam(name="role") String role){
        User user =new User();
        user.setName(name);
        user.setRole(role);
        return userService.addOne(user);
    }
}
