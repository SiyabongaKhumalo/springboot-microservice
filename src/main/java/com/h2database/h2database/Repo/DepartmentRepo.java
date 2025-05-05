package com.h2database.h2database.Repo;

import com.h2database.h2database.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer > {
}
