package org.example.university;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private static volatile FileReader fileReader;
    private static final String FILE_NAME = "src/main/resources/universityInfo.xlsx";
    private static final int STUDENT_SHEET = 0;
    private static final int UNIVERSITY_SHEET = 1;
    private int firstRow = 1;

    private FileReader(){

    }

    public List<Student> getStudents() {
        File file = new File(FILE_NAME);
        List<Student> students = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook wb = new XSSFWorkbook(fis)) {
            XSSFSheet sheet = wb.getSheetAt(STUDENT_SHEET);
            Row row = sheet.getRow(firstRow++);
            while(row != null) {
                students.add(Student.builder()
                        .withFullName(row.getCell(1).getStringCellValue())
                        .withUniversityId(row.getCell(0).getStringCellValue())
                        .withCurrentCourseNumber((int) row.getCell(2).getNumericCellValue())
                        .withAvgExamScore((float) row.getCell(3).getNumericCellValue())
                        .build()
                );
                row = sheet.getRow(firstRow++);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }

    public List<University> getUniversities() {
        File file = new File(FILE_NAME);
        List<University> universities = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook wb = new XSSFWorkbook(fis)) {
            XSSFSheet sheet = wb.getSheetAt(UNIVERSITY_SHEET);
            Row row = sheet.getRow(firstRow++);
            while(row != null) {
                universities.add(University.builder()
                        .withId(row.getCell(0).getStringCellValue())
                        .withFullName(row.getCell(1).getStringCellValue())
                        .withShortName(row.getCell(2).getStringCellValue())
                        .withYearOfFoundation((int) row.getCell(3).getNumericCellValue())
                        .withMainProfile(StudyProfile.valueOf(row.getCell(4).getStringCellValue()))
                        .build()
                );
                row = sheet.getRow(firstRow++);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return universities;
    }

    public static FileReader getInstance() {
        if (fileReader == null) {
            synchronized (FileReader.class) {
                if (fileReader == null) {
                    fileReader = new FileReader();
                }
            }
        }

        return fileReader;
    }
}
