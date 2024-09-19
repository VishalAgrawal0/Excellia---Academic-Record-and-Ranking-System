package excellia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MarksRepository extends JpaRepository<Marks, Long>{
    List<Marks> findByStudentId(Long studentId);

    // Custom JPQL query to fetch records where marks.id = student.id
    @Query("SELECT m FROM Marks m WHERE m.id = m.student.id")
    List<Marks> findMarksByIdEqualsStudentId(Long studentId);

}
