package com.sys.Controller;

import com.sys.domain.Paper;
import com.sys.domain.Topic;
import com.sys.service.PaperService;
import com.sys.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/paper")
public class PaperController {
    @Autowired
    private PaperService paperService;

    @RequestMapping("/listPaper")
    public ModelAndView listPaper(){
        ModelAndView modelAndView = new ModelAndView();
        List<Paper> paperList = paperService.listPaper();
        modelAndView.addObject("paperList",paperList);
        modelAndView.setViewName("../pages/paper-list.jsp");
        System.out.println(paperList);
        return modelAndView;
    }



    @RequestMapping("/delPaper/{paperId}")
    public String delPaper(@PathVariable("paperId") Integer paperId){
        paperService.delPaper(paperId);
        return "redirect:/paper/listPaper";
    }

    @RequestMapping("savePaper")
    public String savePaper(String paperName,String topicId){
        paperService.savePaper(paperName,topicId);
        return "redirect:/paper/listPaper";
    }
}
