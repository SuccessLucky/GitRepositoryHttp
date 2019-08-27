package com.sanciyuan;

import com.sanciyuan.Dao.AccountDao;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author：
 * @Date：2019/8/15 15:54
 */
public class AccountTest {

    @Test
    public void accountTest(){
        //加载spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        //从容器中得到AccountDao对象
        AccountDao accountBean = applicationContext.getBean( AccountDao.class );
        //调用方法
        accountBean.findAll();
    }
}
