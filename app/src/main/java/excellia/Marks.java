package excellia;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Marks {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
   // @Column(name = "subject")
    private String subject;
    
    private Integer marksObtained;
    
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    @JsonBackReference // Prevent infinite recursion
    private Student student;


    //Emply consturctor
    public Marks(){}
    
    public Marks(Long id, String subject, Integer marksObtained, Student student) {
        this.id = id;
        this.subject = subject;
        this.marksObtained = marksObtained;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(Integer marksObtained) {
        this.marksObtained = marksObtained;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    // Constructors, Getters, Setters

}
