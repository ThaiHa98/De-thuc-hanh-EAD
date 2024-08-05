package org.example.repository;

import org.example.Dto.StudentScoreDto;
import org.example.entity.StudentScore;
import org.example.entity.StudentScoreId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GetAllThongTinHocSinh extends JpaRepository<StudentScore, StudentScoreId> {
    @Query("SELECT new org.example.Dto.StudentScoreDto(s.student.id, s.student.fullName, t.name, s.score1, s.score2, t.credit) " +
            "FROM StudentScore s JOIN s.student student JOIN s.topic t")
    List<StudentScoreDto> getAllThongTinHocSinh();
}
