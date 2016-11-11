package login;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Zhong on 2016/11/8.
 */
public class LoginController implements Controller {
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public UserDao getUserDao(){
        return userDao;
    }
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)throws Exception{
        String userName=request.getParameter("userName");
        String userPwd=request.getParameter("userPwd");
        Map model=new HashMap();
        UserVO userVO=userDao.selectByName(userName,userPwd);
        if(userVO != null){
            model.put("userVO", userVO);
            System.out.println("successful");
            System.out.println(model);
            return new ModelAndView("WEB-INF/Main.jsp",model);
        }
        else{
            model.put("error","not match");
            System.out.println("fail");
            System.out.println(model);
            return new ModelAndView("WEB-INF/Login.jsp",model);
        }
    }
}
