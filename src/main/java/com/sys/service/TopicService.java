package com.sys.service;

import com.sys.domain.Topic;

import java.util.List;

public interface TopicService {
    void saveTopic(Topic topic);

    List<Topic> list();

    void del(Integer topicId);
}
