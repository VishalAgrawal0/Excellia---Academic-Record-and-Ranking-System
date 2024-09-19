package excellia;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksService {

    @Autowired
    private MarksRepository marksRepository;

    public List<Marks> getMarksByStudentId(Long studentId) {
        return marksRepository.findByStudentId(studentId);
    }

    public Marks addMarks(Marks marks) {
        return marksRepository.save(marks);
    }

    public List<Marks> findMarksByIdEqualsStudentId(Long studentId) {
        return marksRepository.findMarksByIdEqualsStudentId(studentId);
    }

    // Fetch all marks and filter where marks.id == student.id without custom query
    public List<Marks> getFilteredMarks() {
        // Fetch all marks
        List<Marks> allMarks = marksRepository.findAll();

        // Filter the list where marks.id equals student.id
        return allMarks.stream()
                .filter(marks -> marks.getId().equals(marks.getStudent().getId()))
                .collect(Collectors.toList());
    }

    public List<Marks> getAllMarks() {
        return marksRepository.findAll();
    }
}