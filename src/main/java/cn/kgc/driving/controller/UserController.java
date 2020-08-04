package cn.kgc.driving.controller;

import cn.kgc.driving.pojo.User;
import cn.kgc.driving.service.userService.UserService;
import org.apache.log4j.Logger;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    private static Logger logger = Logger.getLogger(UserController.class);

    @GetMapping("/test")
    @ResponseBody
    public String test(){
            return "this is a test";
}
}
