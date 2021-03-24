package com.exercise.controller;

import com.exercise.entity.SciNews;
import com.exercise.service.SciNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/exercise1/news")
public class SciNewsController {
    @Autowired
    private SciNewsService sciNewsService;

    @RequestMapping(value = "getNews/{id}", method = RequestMethod.GET)
    public SciNews getNews(@PathVariable String id){
        return sciNewsService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "getAllNews", method = RequestMethod.GET)
    public List<SciNews> getAllNews(){
        return sciNewsService.selectAll();
    }

    @RequestMapping(value = "deleteNews/{id}", method = RequestMethod.DELETE)
    public int deleteNews(@PathVariable String id){
        return sciNewsService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "insert" , method = RequestMethod.POST)
    public int insertNews(@RequestBody SciNews sciNews){
        return sciNewsService.insert(sciNews);
    }

    @RequestMapping(value = "update" , method = RequestMethod.PUT)
    public int updateNews(@RequestBody SciNews sciNews){
        return sciNewsService.updateByPrimaryKey(sciNews);
    }
}
