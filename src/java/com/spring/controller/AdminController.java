
package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin/")
public class AdminController {
    
    @RequestMapping("add")
    public String add(){
        return "admin/add";
    }
    
    @RequestMapping("view")
    public String view(){
        return "admin/view";
    }
}
