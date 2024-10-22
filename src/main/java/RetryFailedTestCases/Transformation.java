package RetryFailedTestCases;



import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


public class Transformation implements IAnnotationTransformer {

    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

            annotation.setRetryAnalyzer(Retry.class);

    //we added this class as a listener in testng.xml file to get real time data and to know which test case is failing
    //see the comment in Retry Class


    }
}
