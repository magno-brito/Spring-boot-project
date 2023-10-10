package com.parte2.mywebapp.hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

//atalho para reformatar CTRL + ALT + L
@Controller
@SessionAttributes("name")
public class WelcomeController {

    //This method deals with POST and GET request
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String gotoWelcome(ModelMap model) {
        model.put("name", "name");
        return "welcome";
    }



}
