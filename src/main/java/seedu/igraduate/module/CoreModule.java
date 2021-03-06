package seedu.igraduate.module;

import java.util.ArrayList;

/**
 * Handles core modules. 
 */
public class CoreModule extends Module {
    /**
     * Child class of the modules class that contains the core modules. 
     * 
     * @param code module code. 
     * @param name module name as specified in the user input. 
     * @param credit number of modular credits. 
     * @param status status of completion (tick for completed, cross for uncompleted). 
     * @param grade grade attained for the module, only applicable is status is done. 
     * @param preRequisites prerequisites required for the module. 
     */
    public CoreModule(String code, String name, double credit, String status, String grade,
                      ArrayList<String> preRequisites) {
        super(code, name, credit, status, grade, preRequisites);
    }

    @Override
    public String toString() {
        return "[C]" + super.toString();
    }
}
