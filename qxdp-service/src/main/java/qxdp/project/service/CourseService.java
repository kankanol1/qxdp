package qxdp.project.service;

import org.springframework.data.domain.Pageable;
import qxdp.project.dao.CourseEntity;

import java.util.List;

public interface CourseService {
     List<CourseEntity> findCourseEntityByCheckedLike(Integer checked, Pageable pageable);
     CourseEntity saveCourseEntity(CourseEntity courseEntity);
}
