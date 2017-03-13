package threesixtyfive.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import threesixtyfive.services.HomeService;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getHomePage(ModelMap model) {
        double totalMiles = homeService.getTotalMiles();
        model.addAttribute("miles", totalMiles);
        return new ModelAndView("home", model);
    }


}