package cn.bdqn.kab.controller;

import cn.bdqn.kab.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
    @Autowired
    private NoticeService noticeService;


}
