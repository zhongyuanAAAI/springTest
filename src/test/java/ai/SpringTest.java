package ai;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Zhong on 2016/11/8.
 */
public class SpringTest {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();
        context.stop();
    }
}
