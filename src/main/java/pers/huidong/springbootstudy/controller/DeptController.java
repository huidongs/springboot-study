package pers.huidong.springbootstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pers.huidong.springbootstudy.bean.Department;
import pers.huidong.springbootstudy.dao.DepartmentDao;
import pers.huidong.springbootstudy.mapper.DepartmentMapper;

import javax.annotation.Resource;

/**
 * @program: springboot-study
 * @auther: HuiDong
 * @date: 2020/5/29 16:45
 * @description:
 */
@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id")Integer id){
        return departmentMapper.getDeptById(id);
    }
    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }
}
