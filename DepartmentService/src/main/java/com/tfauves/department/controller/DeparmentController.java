package com.tfauves.department.controller;

import com.tfauves.department.entity.Department;
import com.tfauves.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DeparmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside the saveDepartment: method of the DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside the findDepartmentById: method of the DepartmentController");
        return departmentService.findDepartmentById(departmentId);

    }

}
