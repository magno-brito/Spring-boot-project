package com.parte2.mywebapp.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller()
public class SayHelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, how are you doing?";
    }

    @RequestMapping("/hello-html")
    @ResponseBody()
    public String sayHelloHtml() {
        var sb = new StringBuffer();
        sb.append("<html style=font-size:200pt;background-color:green>");
        sb.append("<head>");
        sb.append("<title>My firs HTML page using Spring Boot</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<p style=text-align:center>My first html page with body</p>");
        sb.append("</body>");
        sb.append("</html>");
        return  sb.toString();
    }

    @RequestMapping("hello-html-jsp")
    public String sayHelloJSP() {
        return "sayHello";
    }

}
