package com.tfauves.department.service;

import com.tfauves.department.entity.Department;
import com.tfauves.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside the saveDepartment: method of the DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside the findDepartmentById: method of the DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
