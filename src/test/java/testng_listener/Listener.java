package testng_listener;

import Base.ScriptBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Listener extends ScriptBase implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("Test Start running:"+result.getMethod());

    }
    public void onTestSuccess(ITestResult result){
        System.out.println("Test Finish properly : "+result.getMethod());

    }

    public void onTestFailure(ITestResult result) {
        Calendar calendar=Calendar.getInstance();

        SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String methodName=result.getName();
        if(result.getStatus()==ITestResult.FAILURE){
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try{
                String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/failure_screenshots";
                File destinationFile=new File((String)reportDirectory+ "/"+ methodName + "_"+formater.format(calendar.getTime())+".png");
                FileUtils.copyFile(srcFile,destinationFile);
                Reporter.log("<a href='" + destinationFile.getAbsolutePath() + "'> <image src='" + destinationFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
            }catch (Exception e){
                e.printStackTrace();

            }
        }
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext context) {
        System.out.println("Test Finish properly");

    }
}
