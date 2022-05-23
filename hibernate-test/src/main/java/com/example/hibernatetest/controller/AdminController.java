package com.example.hibernatetest.controller;


import com.example.hibernatetest.entity.Admin;
import com.example.hibernatetest.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService ;

    @PostMapping("/admin")
    public Admin createAdmin(@RequestBody Admin admin){
        return adminService.createAdmin(admin);
    }




}
