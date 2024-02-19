package Final_HW;

import Logger.PrintLogger;
import Logger.ServiceLogger;
import Number.ComplexNumber;
import Number.ComplexNumberReader;

public class Controller {

    private static final String ADD = "+";
    private static final String SUBTRACT = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";
    private final PrintLogger prLog = new PrintLogger();
    
    private final ServiceLogger log = new ServiceLogger(prLog) ;
    
           
    

    public ComplexNumber run() {

        ComplexNumber c1 = ComplexNumberReader.read();
       
        ComplexNumber c2 = ComplexNumberReader.read();
        ComplexNumber result;

        String operation = OperationReader.getOperation();

        switch (operation) {
            case ADD:
            result =c1.add((c2));
            log.logAdd(c1,c2,result);
                return result;
            case SUBTRACT:
            result = (c1.subtract(c2));
            log.logSubt(c1,c2,result);
                return c1.subtract(c2);
            case MULTIPLY:
            result =c1.multiply(c2);
            log.logMultiplication(c1, c2, result);
                return result;
            case DIVIDE:
            result =c1.divide(c2);
            log.logDivision(c1, c2, result);
                return result;
        }
        return null;
    }

    



    
}
