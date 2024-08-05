package org.example.controller;

import org.example.Dto.StudentScoreDto;
import org.example.service.GetAllThongTinHocSinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/GetAllThongTinHocSinh")
public class GetAllThongTinHocSinhController {
    @Autowired
    private GetAllThongTinHocSinhService getAllThongTinHocSinhService;

    @GetMapping("/getAll")
    public List<StudentScoreDto> getAllStudentScores() {
        return getAllThongTinHocSinhService.getAllThongTinHocSinh();
    }
}
