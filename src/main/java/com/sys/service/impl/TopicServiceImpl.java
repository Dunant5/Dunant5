package com.sys.service.impl;

import com.sys.domain.Topic;
import com.sys.mapper.TopicMapper;
import com.sys.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("topicService")
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicMapper topicMapper;

    public void saveTopic(Topic topic) {
        topicMapper.saveTopic(topic);
    }

    public List<Topic> list() {
       return topicMapper.list();
    }


    public void del(Integer topicId) {
        topicMapper.del(topicId);
    }
}
