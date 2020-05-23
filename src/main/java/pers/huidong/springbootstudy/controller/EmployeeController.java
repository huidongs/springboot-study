package pers.huidong.springbootstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pers.huidong.springbootstudy.dao.EmployeeDao;
import pers.huidong.springbootstudy.entities.Employee;

import java.util.Collection;

/**
 * @program: springboot-study
 * @auther: HuiDong
 * @date: 2020/5/23 16:10
 * @description:
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }
}
