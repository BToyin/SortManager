package com.sparta.toyin;

import com.sparta.toyin.View.UserInput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    static Logger logger = LogManager.getLogger(Starter.class);

    public static <T> void testLog(T input, String message) {
        logger.debug(message + input);
    }

    public static <T extends Exception> void logException(T exception) {
        logger.error("The following exception was thrown: " + exception.getMessage());

        logger.error("Printing Stack Trace");
        for (StackTraceElement stackTraceElement: exception.getStackTrace()) {
            logger.error(stackTraceElement);
        }
    }



}
