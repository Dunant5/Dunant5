package com.sys.service.impl;

import com.sys.domain.Paper;
import com.sys.domain.Topic;
import com.sys.mapper.PaperMapper;
import com.sys.mapper.TopicMapper;
import com.sys.service.PaperService;
import com.sys.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("paperService")
public class PaperServiceImpl implements PaperService {
    @Autowired
    private PaperMapper paperMapper;


    @Override
    public void savePaper(String paperName,String topicId) {
        paperMapper.savePaper(paperName,topicId);
    }

    @Override
    public List<Paper> listPaper() {
        return paperMapper.listPaper();
    }

    @Override
    public void delPaper(Integer paperId) {
        paperMapper.delPaper(paperId);
    }
}
