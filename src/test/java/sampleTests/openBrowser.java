package sampleTests;

import org.testng.annotations.Test;
import anuSampleFramework.base.Base;

import java.io.IOException;

public class openBrowser extends Base {
    @Test
    public void launchBrowser() throws IOException {
        loadProperties();
        openBrowser();

    }


}
