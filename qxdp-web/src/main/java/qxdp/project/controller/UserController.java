package qxdp.project.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qxdp.project.dao.User;
import qxdp.project.impl.UserServiceImpl;


import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
@Api(value = "用戶",tags = "用户管理API")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @ApiOperation(value = "批量保存",notes = "以数组形式传值")
    @RequestMapping(value = "/saveAll",method = RequestMethod.POST)
    public List<User> saveAll(){
        List<User> users = new ArrayList<>();
        for(int i=0;i<2;i++){
            users.add(new User("kankan"+i,"admin",new Date()));
        }
        return userService.saveAll(users);
    }

    @ApiOperation(value = "单一查询",notes = "通过账号ID查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name="uid",value = "ID",required = true,dataType = "Integer"),
            })
    @ResponseBody
    @RequestMapping(value = "/getByUid",method = RequestMethod.POST)
    public User getByUid(Integer uid){
        return userService.findOne(uid);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name="name",value = "名称",required = true,dataType = "String"),
            @ApiImplicitParam(name="role",value = "角色",required = true,dataType = "String"),
            })
    @ApiOperation(value = "条件查询",notes = "通过名称和角色")
    @ResponseBody
    @RequestMapping(value = "/getByNameAndRole",method = RequestMethod.POST)
    public List<User> getByNameAndRole(String name, String role){
        return userService.getUserByNameAndRole(name, role);
    }

    @ApiOperation(value = "模糊查询",notes = "通过名称")
    @ResponseBody
    @RequestMapping(value = "/getByNameLike",method = RequestMethod.POST)
    public List<User> getByNameLike(String Name){
        return userService.getUserByNameLike(Name);
    }

    @ApiOperation(value = "单一保存",notes = "需要参数")
    @ResponseBody
    @RequestMapping(value = "/saveOne",method = RequestMethod.POST)
    @ApiImplicitParams(
            {@ApiImplicitParam(name="name",value = "名称",required = true,dataType = "String"),
            @ApiImplicitParam(name="role",value = "角色",required = true,dataType = "String")}
    )
    private User saveOne(
            @RequestParam(name="name") String name,
            @RequestParam(name="role") String role){
        User user =new User(name,role,new Date());
        return userService.saveOne(user);
    }
}
