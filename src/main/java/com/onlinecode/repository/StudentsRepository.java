package com.onlinecode.repository;

import com.onlinecode.connectsql.model.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository extends CrudRepository<Student,Integer> {
}
