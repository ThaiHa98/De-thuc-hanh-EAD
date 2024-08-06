package org.example.service;

import org.example.Dto.StudentScoreDto;
import org.example.repository.GetAllThongTinHocSinh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllThongTinHocSinhService {
    @Autowired
    private GetAllThongTinHocSinh repository;

    public List<StudentScoreDto> getAllThongTinHocSinh() {
        List<StudentScoreDto> results = repository.getAllThongTinHocSinh();

        // Tính toán grade cho từng StudentScoreDto
        results.forEach(dto -> {
            double averageScore = 0.3 * dto.getScore1() + 0.7 * dto.getScore2();
            if (averageScore >= 8.0) {
                dto.setGrade("A");
            } else if (averageScore >= 6.0) {
                dto.setGrade("B");
            } else if (averageScore >= 4.0) {
                dto.setGrade("C");
            } else if (averageScore >= 2.0) {
                dto.setGrade("D");
            } else {
                dto.setGrade("F");
            }
        });
        return results;
    }
}
