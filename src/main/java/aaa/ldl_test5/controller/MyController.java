package aaa.ldl_test5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {


    /**
     * 跳转过去
     * @return
     */
    @RequestMapping("/test")
    public String test(){
        System.out.println("第一次提交");
        return "test";
    }
}
