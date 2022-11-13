package com.wdd.library.service.impl;

import com.wdd.library.dao.AdminMapper;
import com.wdd.library.pojo.Admin;
import com.wdd.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    //要使用adminMapper接口 要加上@Service
    //且要有自动装配@Autowired
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin select(Admin ad) {
        return adminMapper.select(ad);
    }

    @Override
    public void alterpwd(Admin ad) {
        adminMapper.alterpwd(ad);
    }
}
