package com.space.controller.salary;

import com.space.mybatis.model.Department;
import com.space.service.impl.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sang on 2018/1/26.
 */
@RestController
@RequestMapping("/salary/table")
public class SalaryTableController {
    @Autowired
    DepartmentService departmentService;
    @RequestMapping("/deps")
    public List<Department> departments() {
        return departmentService.getAllDeps();
    }
}
