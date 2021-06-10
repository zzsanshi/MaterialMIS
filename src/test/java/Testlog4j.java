import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

public class Testlog4j {


    private static Logger logger = Logger.getLogger(Testlog4j.class);


    public static void main(String[] args) {
        System.out.println("This is println message.");

        //BasicConfigurator.configure();
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }


}
