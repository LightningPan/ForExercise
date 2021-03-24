package com.exercise.service;

import com.exercise.entity.SysUser;
import com.exercise.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;

    public int deleteByPrimaryKey(String id){
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysUser sysUser){
        return sysUserMapper.insert(sysUser);
    }

    public SysUser selectByPrimaryKey(String id){
        return sysUserMapper.selectByPrimaryKey(id);
    }

    public List<SysUser> selectAll(){
        return sysUserMapper.selectAll();
    }

    public int updateByPrimaryKey(SysUser sysUser){
        return sysUserMapper.updateByPrimaryKey(sysUser);
    }
}
