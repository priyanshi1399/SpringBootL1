package com.priyanshi.jdbl_L1.L1SpringBoot;

import com.priyanshi.jdbl_L1.L1SpringBoot.Entity.Employee;
import com.priyanshi.jdbl_L1.L1SpringBoot.Model.PostEmployeeRequestModel;
import com.priyanshi.jdbl_L1.L1SpringBoot.Model.PostEmployeeResponseModel;
import jakarta.servlet.ServletOutputStream;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @RequestMapping("/")
    public String Test(String s){
        return "Test API Works";
    }

    @RequestMapping("/greet/{name}")
    public String greeting(@PathVariable String name){
        return "Hello " +name+ "!";
    }

    @RequestMapping("/greetRP")
    public String requestParamExample(@RequestParam String name){
        return "Hello "+name + "!";
    }

    @PostMapping("/addEmployee")
    public PostEmployeeResponseModel addEmployee(@RequestBody PostEmployeeRequestModel emp){
        System.out.println(emp);
        Employee e=new Employee(emp.id, emp.name,emp.sal, emp.departmentName);
        //Typically we would call our service which would interact with the database and return the object


        PostEmployeeResponseModel postResponse =new PostEmployeeResponseModel(e.id,e.name,e.sal,e.dept,200,"Success");
        return postResponse;
    }

}

