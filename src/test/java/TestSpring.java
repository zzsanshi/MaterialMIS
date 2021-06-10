import com.project.dao.IAccountdao;
import com.project.domain.Account;
import com.project.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
       // as.findAll();
    }

        @Test
        public void run2() throws Exception {
            ApplicationContext c=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
            System.out.println("1");

        }

}
