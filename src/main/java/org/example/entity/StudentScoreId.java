package org.example.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Embeddable
public class StudentScoreId implements Serializable {

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "topic_id")
    private Integer topicId;

    public Integer getStudentId() { return studentId; }
    public void setStudentId(Integer studentId) { this.studentId = studentId; }

    public Integer getTopicId() { return topicId; }
    public void setTopicId(Integer topicId) { this.topicId = topicId; }

    // hashCode and equals methods
    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (topicId != null ? topicId.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentScoreId that = (StudentScoreId) o;

        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        return topicId != null ? topicId.equals(that.topicId) : that.topicId == null;
    }
}
