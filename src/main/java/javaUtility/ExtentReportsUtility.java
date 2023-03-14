package javaUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsUtility {
	public  ExtentReports report;
	public ExtentSparkReporter sparkreport; 
	public  ExtentTest logtester;

	public void startExtentReport() {
		
		sparkreport= new ExtentSparkReporter("./new.html");
		report=new ExtentReports();
		report.attachReporter(sparkreport);
		report.setSystemInfo("Host Name","Salesforce");
		report.setSystemInfo("Environment", "Automation");
		report.setSystemInfo("Username", "Sathya");

		sparkreport.config().setDocumentTitle("TestExecution Report");
		sparkreport.config().setReportName("Salesforce Regression Testing");
		sparkreport.config().setTheme(Theme.DARK);	
	}
	public void startsingletestReport(String testscript_Name) {
		logtester=report.createTest(testscript_Name);
	}
	public void logtestinfo(String text) {
		logtester.info(text);
	}
	public void testpass(String testscriptname) {
		//logtester.pass(testscriptname);
		logtester.pass(MarkupHelper.createLabel(testscriptname+"is pass", ExtentColor.GREEN));
	}
public void tesfail(String testscriptname) {
	logtester.fail(MarkupHelper.createLabel(testscriptname+"is failed", ExtentColor.RED));	
}
	public void endreport() {
		report.flush();
	}
	public  void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
