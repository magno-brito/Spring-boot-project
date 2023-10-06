package com.parte2.mywebapp.hello;

import com.parte2.mywebapp.authentication.AuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

//atalho para reformatar CTRL + ALT + L
@Controller
@SessionAttributes("name")
public class LoginController {

    //Creating the variable logger to show the loggs
    private Logger logger = LoggerFactory.getLogger(getClass());

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    private AuthenticationService authenticationService;

    @RequestMapping("loginExemple")
    public String logingHello(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        logger.debug("Debug - Request param is {}", name);
        logger.info("Info - Request param is  {}", name);
//        System.out.println("Request param is " + name); //Not a good practice
        return "loginHello";
    }

    //This method deals with POST and GET request
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLogin() {
        return "loginHello";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }
        model.put("errorMessage", "Invalid user of password");
        return "loginHello";

    }


}
