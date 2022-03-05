
package com.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
    
    @RequestMapping("/hello")
    public String index(){
        System.out.println("hello index method");
        String s = "Hello Dhaka";
        return "index";
    }
    
    @RequestMapping("/about")
    public String about(){
        System.out.println("hello index method");
        return "about";
    }
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView indexWithValue(){
        String s = "Hello Dhaka";
        List list = new ArrayList<String>();
        list.add("Dhaka");
        list.add("Ctg");
        list.add("Rangpur");
        list.add("Cumilla");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", list);
        return new ModelAndView("index", "map", map);
    }
    
    @RequestMapping(value = "/contactForm", method = RequestMethod.POST)
    public ModelAndView indexWithForm(HttpServletRequest request){
      
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println(name);
        System.out.println(age);
        List list = new ArrayList<String>();
        list.add(name);
        list.add(age);
        return new ModelAndView("about", "name", name);
    }
    
}
