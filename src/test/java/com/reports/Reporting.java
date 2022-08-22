package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJVMReport(String jsonFile) {

		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\target");
		Configuration configuration = new Configuration(file, "Adactin Automation");

		configuration.addClassifications("Browser Name", "chrome");
		configuration.addClassifications("Browser Version", "103");
		configuration.addClassifications("OS", "WIN10");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

}
