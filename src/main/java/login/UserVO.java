package login;

/**
 * Created by Zhong on 2016/11/8.
 */
public class UserVO {
    private int id;
    private String name;
    private String pwd;
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPwd(String pwd){
        this.pwd=pwd;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPwd(){
        return pwd;
    }
}
