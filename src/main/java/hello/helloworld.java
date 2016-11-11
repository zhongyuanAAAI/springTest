package hello;

/**
 * Created by Zhong on 2016/11/8.
 */

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("hello")
public class helloworld implements InitializingBean{
    @RequestMapping(value="index",method = RequestMethod.GET)
    public String printWelcome(HttpServletRequest request) {
        request.setAttribute("message", "Spring 3 MVC Hello World");
        return "index";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init helloworld");
    }
}


