package com.zjl.controller;

import com.zjl.bean.Emp;
import com.zjl.scw_interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 朱俊磊
 * @time 2021/4/16 18:43
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAllEmp", method = RequestMethod.GET)
    @ResponseBody
    public List<Emp> getAllEmp() {
        return userService.getAllEmp();
    }
}
