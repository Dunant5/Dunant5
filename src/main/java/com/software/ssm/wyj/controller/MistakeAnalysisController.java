package com.software.ssm.wyj.controller;

import com.alibaba.fastjson.JSON;
import com.software.ssm.wtj.dao.ExeHistoryDao;
import com.software.ssm.wtj.pojo.StuPaper;
import com.software.ssm.wyj.dao.MistakeAnalysisDao;
import com.software.ssm.wyj.pojo.StuMistake;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MistakeAnalysisController {
    @RequestMapping("/showMistakeAnalysis/{stuId}.do")
    public ModelAndView showHistoryScore(@PathVariable("stuId") int stuId) throws Exception {
        ModelAndView view = new ModelAndView();
        List<StuMistake> stuMistakeList = MistakeAnalysisDao.INSTANCE.selectMistakeById(stuId);
        String jsonString = JSON.toJSONString(stuMistakeList);
        view.addObject("stuMistake",stuMistakeList);
        view.setViewName("../pages/mistake-Analysis.jsp");
        return view;
    }
}
