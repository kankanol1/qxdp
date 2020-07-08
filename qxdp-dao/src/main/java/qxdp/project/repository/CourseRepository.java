package qxdp.project.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import qxdp.project.dao.CourseEntity;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface CourseRepository extends JpaRepository<CourseEntity,Integer> {
    List<CourseEntity> findCourseEntityByCheckedLike(Integer checked, Pageable pageable);
//    CourseEntity saveCourseEntity(CourseEntity courseEntity);
}
