package Final_HW.Logger;


import java.time.LocalDateTime;

import Number.ComplexNumber;

public class ServiceLogger implements Logger {

    private Logger logger;

    public ServiceLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void logger(String text) {
        logger.logger(text);
    }

    private void logOperation(String operation, ComplexNumber arg1, ComplexNumber arg2, ComplexNumber result) {

        String text = LocalDateTime.now() + " число (" + arg1 + ")" + " операция: " + operation + " число (" + arg2
                + ") = ";

        logger.logger(text);

    }

    public void logAdd(ComplexNumber arg1, ComplexNumber arg2, ComplexNumber result) {
        logOperation("+", arg1, arg2, result);
    }

    public void logSubt(ComplexNumber arg1, ComplexNumber arg2, ComplexNumber result) {
        logOperation("-", arg1, arg2, result);
    }

    public void logMultiplication(ComplexNumber arg1, ComplexNumber arg2, ComplexNumber result) {
        logOperation("*", arg1, arg2, result);
    }

    public void logDivision(ComplexNumber arg1, ComplexNumber arg2, ComplexNumber result) {
        logOperation("/", arg1, arg2, result);
    }

    public void logPrint(String message) {
        System.out.println(message); // для вывода на печать
    }

}
