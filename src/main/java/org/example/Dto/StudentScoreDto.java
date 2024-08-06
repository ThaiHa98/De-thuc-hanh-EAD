package org.example.Dto;

public class StudentScoreDto {
    private Integer studentId;
    private String studentName;
    private String topicName;
    private Integer score1;
    private Integer score2;
    private Integer credit;
    private String grade;

    public StudentScoreDto(Integer studentId, String studentName, String topicName, Integer score1, Integer score2, Integer credit) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.topicName = topicName;
        this.score1 = score1;
        this.score2 = score2;
        this.credit = credit;
        calculateGrade();
    }

    // Getters and Setters
    public Integer getStudentId() { return studentId; }
    public void setStudentId(Integer studentId) { this.studentId = studentId; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getTopicName() { return topicName; }
    public void setTopicName(String topicName) { this.topicName = topicName; }

    public Integer getScore1() { return score1; }
    public void setScore1(Integer score1) {
        this.score1 = score1;
        calculateGrade();
    }

    public Integer getScore2() { return score2; }
    public void setScore2(Integer score2) {
        this.score2 = score2;
        calculateGrade();
    }

    public Integer getCredit() { return credit; }
    public void setCredit(Integer credit) { this.credit = credit; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    private void calculateGrade() {
        if (score1 == null || score2 == null) {
            this.grade = "Invalid";
            return;
        }
        double averageScore = 0.3 * score1 + 0.7 * score2;
        if (averageScore >= 8.0) {
            this.grade = "A";
        } else if (averageScore >= 6.0) {
            this.grade = "B";
        } else if (averageScore >= 4.0) {
            this.grade = "C";
        } else if (averageScore >= 2.0) {
            this.grade = "D";
        } else {
            this.grade = "F";
        }
    }
}

