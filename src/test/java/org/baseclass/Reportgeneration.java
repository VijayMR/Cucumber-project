package org.baseclass;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reportgeneration {
	
	public static void jvmReport(String json) {
		
		File file=new File("C:\\Users\\vijay\\eclipse-workspace\\cucucmber\\target\\report");
		
		Configuration configuration=new Configuration(file, "sampleproject");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Sprint no", "23");
		configuration.addClassifications("Platform", "Win10");
		configuration.addClassifications("Reportgeneratorname", "Vijay");
		
		java.util.List<String> li=new ArrayList<String>();
		li.add(json);
		
		ReportBuilder builder=new ReportBuilder(li, configuration);
		builder.generateReports();
		

	}

}
