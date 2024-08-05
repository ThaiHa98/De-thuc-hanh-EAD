package org.example.controller;

import org.example.entity.StudentScore;
import org.example.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student-scores")
public class StudentScoreController {
    @Autowired
    private StudentScoreService studentScoreService;

    @GetMapping("GetList")
    public List<StudentScore> getAllStudentScores() {
        return studentScoreService.getAllStudentScores();
    }

    @GetMapping("getStudentScoreById/{studentId}/{topicId}")
    public StudentScore getStudentScoreById(@PathVariable Integer studentId, @PathVariable Integer topicId) {
        return studentScoreService.getStudentScoreById(studentId, topicId);
    }

    @PostMapping("Add")
    public ResponseEntity<StudentScore> createStudentScore(@RequestBody StudentScore studentScore) {
        if (studentScore.getStudent() != null && studentScore.getStudent().getId() != null &&
                studentScore.getTopic() != null && studentScore.getTopic().getId() != null) {
            StudentScore savedStudentScore = studentScoreService.saveStudentScore(studentScore);
            return new ResponseEntity<>(savedStudentScore, HttpStatus.CREATED);
        } else {
            throw new IllegalArgumentException("Student or Topic must have valid ID");
        }
    }

    @DeleteMapping("Delete/{studentId}/{topicId}")
    public void deleteStudentScore(@PathVariable Integer studentId, @PathVariable Integer topicId) {
        studentScoreService.deleteStudentScore(studentId, topicId);
    }
}
