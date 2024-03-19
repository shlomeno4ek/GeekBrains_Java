package logger;

import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.Level;

public class FileLog implements Loggable {

    private static final Logger logger = Logger.getLogger(FileLog.class.getName());

    static {
        try(FileInputStream in = new FileInputStream("log.config")){
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void logging(String message) {
        logger.log(Level.INFO, LocalDateTime.now() + " <--- : ---> " + message);

    }

}
