package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Iterator;

@Service
public class ExcelImportService {

    @Autowired
    private StudentRepository studentRepository;

    public void importStudents(MultipartFile file) throws IOException {
        Workbook workbook = new XSSFWorkbook(file.getInputStream());
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            Student student = new Student();

            student.setMatricule(getCell(row, 0));
            student.setIdentifiantUnique(getCell(row, 1));
            student.setIdentifiantCarte(getCell(row, 2));
            student.setNom(getCell(row, 3));
            student.setPrenom(getCell(row, 4));
            student.setNomPrenomArabe(getCell(row, 5));
            student.setDateNaissance(LocalDate.parse(getCell(row, 6)));
            student.setLieuNaissance(getCell(row, 7));
            student.setSexe(getCell(row, 8));
            student.setEtablissementProvenance(getCell(row, 9));
            student.setAdresse(getCell(row, 10));
            student.setNiveau(getCell(row, 11));
            student.setClasse(getCell(row, 12));
            student.setEtatSante(getCell(row, 13));
            student.setDescriptionSante(getCell(row, 14));

            studentRepository.save(student);
        }

        workbook.close();
    }

    private String getCell(Row row, int index) {
        return row.getCell(index) != null ? row.getCell(index).toString().trim() : null;
    }
}
