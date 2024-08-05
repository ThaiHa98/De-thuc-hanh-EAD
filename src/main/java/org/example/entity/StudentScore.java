package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_score_t")
public class StudentScore {

    @EmbeddedId
    private StudentScoreId id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private Student student;

    @ManyToOne
    @MapsId("topicId")
    @JoinColumn(name = "topic_id", insertable = false, updatable = false)
    private Topic topic;

    @Column(name = "Score1")
    private Integer score1;

    @Column(name = "Score2")
    private Integer score2;

    // Getters and Setters
    public StudentScoreId getId() { return id; }
    public void setId(StudentScoreId id) { this.id = id; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Topic getTopic() { return topic; }
    public void setTopic(Topic topic) { this.topic = topic; }

    public Integer getScore1() { return score1; }
    public void setScore1(Integer score1) { this.score1 = score1; }

    public Integer getScore2() { return score2; }
    public void setScore2(Integer score2) { this.score2 = score2; }
}
