package openWebsiteTestNG.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {
    private final Logger logger = LogManager.getRootLogger();

    @Override
    public void onTestFailure(ITestResult tr) {
        if (tr.getName().contains("Blabla")) {
            logger.info(tr.getName() + 2);
        } else {
            logger.info(tr.getName());
        }

    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        if (tr.getName().contains("Blabla")) {
            logger.info(tr.getName() + 2);
        } else {
            logger.info(tr.getName());
        }
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        if (tr.getName().contains("Blabla")) {
            logger.info(tr.getName() + 1);
        }
    }

}

