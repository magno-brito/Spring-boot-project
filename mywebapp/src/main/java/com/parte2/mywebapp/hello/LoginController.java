package com.parte2.mywebapp.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//atalho para reformatar CTRL + ALT + L
@Controller
public class LoginController {

    //Creating the variable logger to show the loggs
    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("login")
    public String logingHello(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        logger.debug("Debug - Request param is {}", name);
        logger.info("Info - Request param is  {}", name);
//        System.out.println("Request param is " + name); //Not a good practice
        return "loginHello";
    }


}
