package login;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Zhong on 2016/11/8.
 */
public class UserDao implements UserDaoImp{
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    public UserVO selectByName(String name,String pwd){
        String sql="select * from attribute where name=? and pwd=?";
        try {
            return jdbcTemplate.queryForObject(sql,ParameterizedBeanPropertyRowMapper.newInstance(UserVO.class),name,pwd);
        }
        catch (Exception e){
            return null;
        }
    }
    public void insertByName(String name,String pwd){
        String sql="insert into attribute(name,pwd) values(?,?)";
        try{
            jdbcTemplate.update(sql, new PreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement pstmt) throws SQLException {
                    pstmt.setObject(1, name);
                    pstmt.setObject(2, pwd);
                }});
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
