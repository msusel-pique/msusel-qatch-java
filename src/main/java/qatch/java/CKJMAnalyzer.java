package qatch.java;

import qatch.analysis.IAnalyzer;
import qatch.model.Measure;
import qatch.model.Property;
import qatch.model.PropertySet;

import java.util.Iterator;

public class CKJMAnalyzer implements IAnalyzer {

    public static final String TOOL_NAME = "CKJM";

    /**
     * This method is responsible for analyzing a single project against a set of
     * properties by using the CKJM Tool.
     *
     * @param src      : The path of the folder that contains the class files of the desired project.
     * @param dest     : The path where the XML file that contains the results should be placed.
     *
     * Typically this method does the following:
     *
     * 		1. Iterates through the PropertySet.
     * 		2. If it finds at least one property that uses the CKJM tool then it calls the
     * 			simple analyze() method.
     *
     * IDEA:
     *   - All the metrics are calculated for the project and then loaded by the program.
     *   - After that we decide which metrics to keep by iterating through the PropertySet of
     *     the Quality Model.
     *
     * It has this form in order to look the same with the PMDAnalyzer.
     */
    @Override
    public void analyze(String src, String dest, PropertySet properties) {

        //Iterate through the properties of the desired PropertySet object
        Iterator<Property> iterator = properties.iterator();
        Property p = null;

        //For each property found in the desired PropertySet do...
        while(iterator.hasNext()) {

            //Get the current property
            p = iterator.next();

            //Check if it is a ckjm property
            //TODO: Check this outside this function
            if (p.getMeasure().getTool().equals(TOOL_NAME)) {

                analyzeSubroutine(src, dest);

                //Found at least one ckjm property. Process finished.
                break;

            } else {
                //Print some messages for debugging purposes
                //System.out.println("* Property : " + p.getName() + " is not a CKJM Property!!");
            }
        }
    }

    protected void analyzeSubroutine(String src, String dest) {
        throw new RuntimeException("Not yet implemented");
    }

}


