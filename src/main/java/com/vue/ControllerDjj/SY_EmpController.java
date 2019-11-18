package com.vue.ControllerDjj;

import com.vue.model.SY_Emp;
import com.vue.services.SY_EmpServiceDjj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/djj")
public class SY_EmpController {
    @Autowired
    private SY_EmpServiceDjj sy_empService;

    @RequestMapping("test")
    public String test(){
        List<SY_Emp> emplist = sy_empService.emplist();
        for (SY_Emp syEmp : emplist) {
            System.out.println(syEmp);
        }
        return null;
    }
}
