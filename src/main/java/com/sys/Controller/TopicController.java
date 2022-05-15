package com.sys.Controller;

import com.sys.domain.Topic;
import com.sys.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/topic")
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/save")
    public String save(Topic topic){
        topicService.saveTopic(topic);
        return "redirect:/topic/list";
    }

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<Topic> topicList = topicService.list();
        modelAndView.addObject("topicList",topicList);
        modelAndView.setViewName("../pages/topic-list.jsp");
        return modelAndView;
    }

    @RequestMapping("/listPT")
    public ModelAndView listPT(){
        ModelAndView modelAndView = new ModelAndView();
        List<Topic> topicList = topicService.list();
        modelAndView.addObject("topicList",topicList);
        modelAndView.setViewName("../pages/paper-add.jsp");
        return modelAndView;
    }

    @RequestMapping("/del/{topicId}")
    public String del(@PathVariable("topicId") Integer topicId){
        topicService.del(topicId);
        return "redirect:/topic/list";
    }
}
