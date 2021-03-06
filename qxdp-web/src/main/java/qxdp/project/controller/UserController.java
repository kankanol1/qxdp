package qxdp.project.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import qxdp.project.dao.User;
import qxdp.project.impl.UserServiceImpl;

import javax.validation.constraints.NotEmpty;
import java.util.*;

@Controller
@RequestMapping("/api/user")
@Api(value = "用戶", tags = "用户管理API")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @ApiOperation(value = "批量保存", notes = "以数组形式传值,测试用例")
    @RequestMapping(value = "/saveAll", method = RequestMethod.POST)
    public List<User> saveAll() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add(new User("kankanad", "admin", new Date(), "kankan"));
        }
        return userService.saveAll(users);
    }

    @ApiOperation(value = "单一查询", notes = "通过账号ID查询")
    @ApiImplicitParam(name = "uid", value = "用户ID", required = true, dataType = "Int")
    @ResponseBody
    @NotEmpty(message = "用户ID不可为空")
    @RequestMapping(value = "/getByUid", method = RequestMethod.POST)
    public User getOne(Integer uid) {
        return userService.findOne(uid);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "role", value = "角色", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String"),
    })
    @ApiOperation(value = "条件查询", notes = "通过名称和角色")
    @ResponseBody
    @RequestMapping(value = "/getByNameAndRole", method = RequestMethod.POST)
//    public List<User> getByNameAndRole(String name, String role){
    public Object getByNameAndRole(String name, String role,String password) {

        List<User> users = userService.getUserByNameAndRole(name, role);
        List<String> list = new LinkedList<>();
        Map<String, Object> map = new LinkedHashMap<>();

        System.out.println(users.size());
        System.out.println(password);
        System.out.println(users.get(0).toString());

        if(users.size()==1 & users.get(0).getPassword()==password){
            System.out.println(users.get(0).getPassword());

            System.out.println(users.get(0).toString());
            list.add("admin");
            map.put("status", "ok");
            map.put("currentAuthority", list);
            map.put("data", users);
        }else{
            map.put("status", "error");
        }
        return map;
    }


    @ApiOperation(value = "匹配查询", notes = "通过名称")
    @ApiImplicitParam(name = "name", value = "名称", required = true, dataType = "String")
    @ResponseBody
    @RequestMapping(value = "/getByNameLike", method = RequestMethod.POST)
    public List<User> getByNameLike(String name, Pageable pageable) {
        return userService.getUserByNameLike(name, pageable);
    }

    @ApiOperation(value = "单一保存", notes = "需要参数")
    @ResponseBody
    @RequestMapping(value = "/saveOne", method = RequestMethod.POST)
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "name", value = "名称", required = true, dataType = "String"),
                    @ApiImplicitParam(name = "role", value = "角色", required = true, dataType = "String"),
                    @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String"),
            }
    )
//    private User saveOne(String name, String role,String password){
    private Object saveOne(String name, String role, String password) {
        User user = new User(name, role, new Date(), password);
        System.out.println(user.toString());
        Map<String, Object> map = new LinkedHashMap<>();

        User users = userService.saveOne(user);
       if(users.getName()!=name){
           map.put("status", "error");
       }else{
           map.put("status", "ok");
           map.put("data", users);
       }
        return map;
    }

    @ApiOperation(value = "单一删除", notes = "需要参数")
    @ApiImplicitParam(name = "uid", value = "用户ID", required = true, dataType = "Int")
    @ResponseBody
    @RequestMapping(value = "/deleteOne", method = RequestMethod.POST)
    private User deleteOne(Integer uid) {
        return userService.deleteOne(uid);
    }

    @ApiOperation(value = "单一更新", notes = "需要参数")
    @ResponseBody
    @RequestMapping(value = "/updateOne", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "role", value = "用户角色", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "uid", value = "用户ID", required = true, dataType = "Int"),
    })
    private User updateOne(String name, String role, Integer uid, String password) {
        User user = new User(name, role, new Date(), password);
        user.setUid(uid);
        return userService.saveOne(user);
    }
}
