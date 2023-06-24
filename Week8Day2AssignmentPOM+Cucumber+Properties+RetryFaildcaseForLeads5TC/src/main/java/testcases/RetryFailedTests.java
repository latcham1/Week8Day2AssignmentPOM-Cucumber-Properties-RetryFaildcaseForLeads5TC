package testcases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;

public class RetryFailedTests implements IRetryAnalyzer, IAnnotationTransformer{
	int retryCount=0;
	int maxRetry=2;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (retryCount<maxRetry)
		{
			retryCount++;
			return true;
		}
		return false;
	}
@Override
public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	// TODO Auto-generated method stub
	annotation.setRetryAnalyzer(RetryFailedTests.class);
}

}
