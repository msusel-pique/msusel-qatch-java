package qatch.java;

import java.net.URISyntaxException;

public class SingleProjectEvaluation {

    /**
     * Main method for running quality evaluation on a single project.
     *
     * @param args configuration array in following order:
     *             0: path to project to be evaluated root folder
     *             1: path to folder to place results
     *    These arg paths can be relative or full path
     */
    public static void main(String[] args) throws URISyntaxException {

        // Global fields
        final String projectLoc;
        final String resultsLoc;

        // Initialize configurations
        try {
            projectLoc = args[0];
            resultsLoc = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Application was not provided Project Location and Results Location command line arguments");
        }
//        final String resultsDirName = "qa-results";
//        final File root = new File(SingleProjectEvaluation.class
//            .getProtectionDomain()
//            .getCodeSource()
//            .getLocation()
//            .toURI()).getParentFile();
//        final File qaDir = new File(root, resultsDirName);

        System.out.println("******************************  Project Evaluator *******************************");
        System.out.println();


    }

}
