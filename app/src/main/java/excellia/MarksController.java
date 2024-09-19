package excellia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/marks")
public class MarksController {

    @Autowired
    private MarksService marksService;

    // @GetMapping("/student/{studentId}")
    // public List<Marks> getMarksByStudent(@PathVariable Long studentId) {
    //     return marksService.getMarksByStudentId(studentId);
    // }

    @GetMapping("/student/{studentId}")
    public List<Marks> findMarksByIdEqualsStudentId(@PathVariable Long studentId) {
        return marksService.findMarksByIdEqualsStudentId(studentId);
    }

    @PostMapping
    public Marks addMarks(@RequestBody Marks marks) {
        return marksService.addMarks(marks);
    }

    @GetMapping("/rank")
    public List<StudentRankingDTO> getStudentRankings() {
        // Logic for ranking students based on total marks
        // Create a list to store student ranking data
        List<StudentRankingDTO> studentRankingList = new ArrayList<>();

        // Example of adding student rankings to the list (normally fetched from the
        // database)
        studentRankingList.add(new StudentRankingDTO(3, "Vishal", (long) 66));
        studentRankingList.add(new StudentRankingDTO(1, "John Doe", (long)98));
        studentRankingList.add(new StudentRankingDTO(2, "Jane Smith", (long)95));

        // Return the list of rankings
        return studentRankingList;
    }
}
