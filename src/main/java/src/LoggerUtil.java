package src;
import java.util.logging.Logger;
public class LoggerUtil {
    private static Logger logger= Logger.getLogger(LoggerUtil.class.getName());
    public static void log(String message){
        logger.info(message);
    }


}
