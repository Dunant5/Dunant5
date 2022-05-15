package com.sys.mapper;

import com.sys.domain.Paper;
import com.sys.domain.Topic;

import java.util.List;


public interface PaperMapper {
   void savePaper(String paperName,String topicId);

   List<Paper> listPaper();

   void delPaper(Integer paperId);
}
