package com.zjl.service;

import com.zjl.bean.Emp;
import com.zjl.mapper.EmpMapper;
import com.zjl.scw_interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 朱俊磊
 * @time 2021/4/16 18:50
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Emp> getAllEmp() {
        return empMapper.getAllEmp();
    }
}
