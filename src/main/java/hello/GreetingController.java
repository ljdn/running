package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/runs")
    public String tracker(@RequestParam(value="name", required=false, defaultValue="World") String miles, Model model) {
        model.addAttribute("miles", miles);
        return "tracker";
    }

}