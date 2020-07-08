package qxdp.project.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import qxdp.project.dao.CourseEntity;
import qxdp.project.impl.CourseServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/api/sys/course")
@Api(value = "课程",tags = "课程管理API")
public class CourseController {

    @Autowired
    private CourseServiceImpl courseServiceImpl;



    @ApiOperation(value = "保存")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public CourseEntity saveCourseEntity(CourseEntity courseEntity){
        System.out.println(courseEntity.toString());
        return  courseServiceImpl.saveCourseEntity(courseEntity);
    }


    @ResponseBody
    @ApiOperation(value = "查询",notes = "传值")
    @ApiImplicitParam(name="check",value = "是否审核",required = true,dataType = "Int")
    @RequestMapping(value = "/fcbcl",method = RequestMethod.POST)
    public List<CourseEntity> findCourseEntityByCheckedLike(Integer checked, Pageable pageable){
        return courseServiceImpl.findCourseEntityByCheckedLike(checked,pageable);
    }

}
