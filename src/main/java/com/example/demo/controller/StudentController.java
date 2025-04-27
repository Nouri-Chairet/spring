package com.example.demo.controller;

import com.example.demo.service.ExcelImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private ExcelImportService excelImportService;
    @CrossOrigin(origins = "*")
    @PostMapping("/import")
    public ResponseEntity<String> importExcel(@RequestParam("file") MultipartFile file) {
        try {
            excelImportService.importStudents(file);
            return ResponseEntity.ok("Students imported successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to import: " + e.getMessage());
        }
    }
}
