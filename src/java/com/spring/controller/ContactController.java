
package com.spring.controller;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
    

    public ContactController() {
       // this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    
}
