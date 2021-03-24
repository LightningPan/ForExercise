package com.exercise.mapper;

import com.exercise.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(String id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}