package com.exercise.mapper;

import com.exercise.entity.SciNews;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SciNewsMapper {
    int deleteByPrimaryKey(String id);

    int insert(SciNews record);

    SciNews selectByPrimaryKey(String id);

    List<SciNews> selectAll();

    int updateByPrimaryKey(SciNews record);

    List<SciNews> selectByUser(String id);
}