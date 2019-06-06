package msu.msusel;

import miltos.diploma.model.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        QualityModelLoader qmImporter = new QualityModelLoader("C:\\Users\\davidrice3\\Repository\\MSUSEL\\msusel-qatch\\Archive\\Web Service\\QualityModels\\qualityModel.xml");
        QualityModel qualityModel = qmImporter.importQualityModel();

        System.out.println( "Goodbye World!" );
    }
}
