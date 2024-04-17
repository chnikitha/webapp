package com.nikki.WebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikki.WebApp.entity.Student;

import java.util.List;
import java.util.Optional;

//broker
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    List<Student> findByDepartment(String department);
}
