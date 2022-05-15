package com.sys.mapper;

import com.sys.domain.Topic;

import java.util.List;


public interface TopicMapper {
   void saveTopic(Topic topic);

   List<Topic> list();

   void del(Integer topicId);
}
