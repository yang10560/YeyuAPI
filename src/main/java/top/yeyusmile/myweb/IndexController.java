package top.yeyusmile.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String hello(Model model) {
        model.addAttribute("msg", "springboot集成thymeleaf");
        return "docs";
    }

}