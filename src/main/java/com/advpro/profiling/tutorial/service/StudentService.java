package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
//        List<Student> students = studentRepository.findAll();
//        List<StudentCourse> studentCourses = new ArrayList<>();
//        for (Student student : students) {
//            List<StudentCourse> studentCoursesByStudent = studentCourseRepository.findByStudentId(student.getId());
//            for (StudentCourse studentCourseByStudent : studentCoursesByStudent) {
//                StudentCourse studentCourse = new StudentCourse();
//                studentCourse.setStudent(student);
//                studentCourse.setCourse(studentCourseByStudent.getCourse());
//                studentCourses.add(studentCourse);
//            }
//        }
//        return studentCourses;
        return studentCourseRepository.findAll();
    }

    public Optional<Student> findStudentWithHighestGpa() {
//        List<Student> students = studentRepository.findAll();
//        Student highestGpaStudent = null;
//        double highestGpa = 0.0;
//        for (Student student : students) {
//            if (student.getGpa() > highestGpa) {
//                highestGpa = student.getGpa();
//                highestGpaStudent = student;
//            }
//        }
//        return Optional.ofNullable(highestGpaStudent);
        return studentRepository.findAll().stream()
                .max(Comparator.comparingDouble(Student::getGpa));
    }

    public String joinStudentNames() {
        List<Student> students = studentRepository.findAll();
//        String result = "";
        StringBuilder result = new StringBuilder();
        for (Student student : students) {
            result.append(student.getName()).append(", ");
        }
        if (result.isEmpty()) {
            result.delete(result.length()-2, result.length());
        }
        return result.toString();
    }
}

