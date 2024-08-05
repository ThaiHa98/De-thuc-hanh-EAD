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
            double averageScore = (dto.getScore1() + dto.getScore2()) / 2.0;
            if (averageScore >= 8.0) {
                dto.setGrade("A");
            } else if (averageScore >= 6.0) {
                dto.setGrade("B");
            } else if (averageScore >= 4.0) {
                dto.setGrade("C");
            } else {
                dto.setGrade("D");
            }
        });
        return results;
    }
}
