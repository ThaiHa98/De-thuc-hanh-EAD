package org.example.service;

import org.example.Dto.StudentScoreDto;
import org.example.entity.StudentScore;
import org.example.repository.StudentScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentScoreService {
    @Autowired
    private StudentScoreRepository studentScoreRepository;

    public List<StudentScore> getAllStudentScores() {
        return studentScoreRepository.findAll();
    }

    public StudentScore getStudentScoreById(Integer studentId, Integer topicId) {
        return studentScoreRepository.findByStudent_IdAndTopic_Id(studentId, topicId).orElse(null);
    }

    public StudentScore saveStudentScore(StudentScore studentScore) {
        return studentScoreRepository.save(studentScore);
    }

    public void deleteStudentScore(Integer studentId, Integer topicId) {
        studentScoreRepository.deleteByStudent_IdAndTopic_Id(studentId, topicId);
    }
}
