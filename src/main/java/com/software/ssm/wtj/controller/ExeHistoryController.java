package com.software.ssm.wtj.controller;

import com.alibaba.fastjson.JSON;
import com.software.ssm.wtj.dao.ExeHistoryDao;
import com.software.ssm.wtj.pojo.StuPaper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ExeHistoryController {
    @RequestMapping("/showHistoryScore/{stuId}.do")
    public ModelAndView showHistoryScore(@PathVariable("stuId") int stuId) throws Exception {
        ModelAndView view = new ModelAndView();
        List<StuPaper> stuPaperList = ExeHistoryDao.INSTANCE.selectStuPaperById(stuId);
        String jsonString = JSON.toJSONString(stuPaperList);
        view.addObject("stuPaper",stuPaperList);
        view.setViewName("../pages/exercise_history.jsp");
        return view;
    }
}
