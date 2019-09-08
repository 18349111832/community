package life.xhu.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 橘子吃柚子
 * @date 2019-09-01-14:36
 */
@Controller
public class  IndexController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
