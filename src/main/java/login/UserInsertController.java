package login;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhong on 2016/11/11.
 */
public class UserInsertController implements Controller{
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
        userDao.insertByName(userName,userPwd);
        return new ModelAndView("WEB-INF/Main.jsp",model);
    }
}
