package org.example.repository;

import org.example.Dto.StudentScoreDto;
import org.example.entity.StudentScore;
import org.example.entity.StudentScoreId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentScoreRepository extends JpaRepository<StudentScore, StudentScoreId> {
    Optional<StudentScore> findByStudent_IdAndTopic_Id(Integer studentId, Integer topicId);
    void deleteByStudent_IdAndTopic_Id(Integer studentId, Integer topicId);

}
