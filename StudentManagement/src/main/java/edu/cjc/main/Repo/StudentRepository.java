package edu.cjc.main.Repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cjc.main.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByBatchNumber(String batchNumber);

}
