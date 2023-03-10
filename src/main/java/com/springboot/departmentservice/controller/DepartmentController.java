package com.springboot.departmentservice.controller;

import com.springboot.departmentservice.entity.Department;
import com.springboot.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController ");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentbyId(@PathVariable("id") Long departmentId){
        log.info("Inside findDepartmentbyId method of DepartmentController ");
        return departmentService.findDepartmentbyId(departmentId);
    }
}
