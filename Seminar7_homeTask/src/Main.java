import logger.FileLog;
import logger.Loggable;

import logger.impl.ConsoleLogger;
import util.impl.Calculator;
import logger.impl.LoggedCalculator;
import view.UserView;

public class Main {

    public static void main(String[] args) {

//        Loggable log = new FileLog();
        Loggable log = new ConsoleLogger();

        UserView view = new UserView( new LoggedCalculator(new Calculator(), log));
        view.run();
    }
}