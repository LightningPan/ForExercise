package com.exercise.controller;

import com.exercise.entity.SysUser;
import com.exercise.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/exercise1/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "insert" , method = RequestMethod.POST)
    public int insertUser(@RequestBody SysUser sysUser){
        return sysUserService.insert(sysUser);
    }

    @RequestMapping(value = "delete/{id}" , method = RequestMethod.DELETE)
    public int deleteUser(@PathVariable String id){
        return sysUserService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "update" , method = RequestMethod.PUT)
    public int updateUser(@RequestBody SysUser sysUser){
        return sysUserService.updateByPrimaryKey(sysUser);
    }

    @RequestMapping(value = "getUser/{id}" , method = RequestMethod.GET)
    public SysUser selectByPrimaryKey(@PathVariable String id){
        return sysUserService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "getAllUsers" , method = RequestMethod.GET)
    public List<SysUser> selectAll(){
        return sysUserService.selectAll();
    }
}
