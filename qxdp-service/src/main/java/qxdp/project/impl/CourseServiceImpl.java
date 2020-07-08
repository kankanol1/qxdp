package qxdp.project.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qxdp.project.dao.CourseEntity;
import qxdp.project.repository.CourseRepository;
import qxdp.project.service.CourseService;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Transactional
    @Override
    public List<CourseEntity> findCourseEntityByCheckedLike(Integer checked, Pageable pageable) {
        return courseRepository.findCourseEntityByCheckedLike(checked, pageable);
    }
    public CourseEntity saveCourseEntity(CourseEntity courseEntity){
        return courseRepository.save(courseEntity);
    }
}
