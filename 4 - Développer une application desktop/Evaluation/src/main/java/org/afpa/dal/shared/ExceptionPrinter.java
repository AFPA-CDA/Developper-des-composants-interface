package org.afpa.dal.shared;

import java.sql.SQLException;

/**
 * Used to pretty print exceptions
 *
 * @param <T> The exception to pretty print
 */
public class ExceptionPrinter<T extends Exception> {
    private final T exception;

    public ExceptionPrinter(T exception) {
        this.exception = exception;
    }

    /**
     * Pretty prints the current exception
     */
    public void print() {
        System.err.printf("Exception Type: %s\n", exception.getClass());

        if (exception instanceof SQLException) {
            System.err.printf("Error Code: %s\n", ((SQLException) exception).getErrorCode());
            System.err.printf("SQLState: %s\n", ((SQLException) exception).getSQLState());
        }

        System.err.printf("Cause: %s\n", exception.getCause());
        System.err.printf("Message: %s\n", exception.getMessage());
    }
}
