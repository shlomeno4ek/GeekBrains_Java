package logger.impl;

import logger.Loggable;

import java.time.LocalDateTime;
import java.util.logging.Logger;

public class ConsoleLogger implements Loggable {
    @Override
    public void logging(String message) {
        System.err.println(LocalDateTime.now() + " <--- : ---> " + message);
    }
}
