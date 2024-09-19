package excellia;

public class StudentRankingDTO {
    private Long studentId;
    private String studentName;
    private int totalMarks;
    private int rank;

    public StudentRankingDTO(int rank, String studentName, Long studentId) {
        this.rank = rank;
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    // Constructors, Getters, Setters
}
