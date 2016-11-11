package login;

/**
 * Created by Zhong on 2016/11/8.
 */
public interface UserDaoImp {
    // public UserVO select(int id);
    public UserVO selectByName(String name,String pwd);
    public void insertByName(String name, String pwd);
}
