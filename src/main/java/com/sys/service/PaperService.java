package com.sys.service;

import com.sys.domain.Paper;
import com.sys.domain.Topic;

import java.util.List;

public interface PaperService {
    void savePaper(String paperName,String topicId);

    List<Paper> listPaper();

    void delPaper(Integer paperId);
}
