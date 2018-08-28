package com.spanishTax.controller;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spanishTax.service.Form303Service;
import com.spanishTax.service.PersonService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;


@Controller
@RequestMapping("data")
public class AddData {
	public static final String DATA1 = "/addData";
	public static final String PDATA="addData";
	public static final String REMOVE = "/removecontact";
	
	//Define Autowired
	@Autowired
	@Qualifier("form303Impl") //Passing Form303ServiceImpl
	private Form303Service form303Service;
	
	//@Autowired
	@Qualifier("personServiceImpl")
	private PersonService personService;
	
	
	/*@GetMapping(DATA1)
	public String addData() {
		System.out.println("Showing Data List!!");
		ModelAndView mav = new ModelAndView(PDATA);
		
		mav.addObject("personData",form303Service.listAllPersons());
		return DATA1;
	}*/
	
	@GetMapping(DATA1)
	public ModelAndView showData() {
		System.out.println("Showing Data List!!");
		ModelAndView mav = new ModelAndView(PDATA);
		mav.addObject("addData",form303Service.listAllPersons()); //List Users on DB
		return mav;
	}
	
	//Method to create report
	@RequestMapping(value = "/report", method = RequestMethod.GET)
	@ResponseBody
	public void getRpt1(HttpServletResponse response) throws JRException, IOException, FileNotFoundException {
		System.out.println("Generating Report...");
		String pdfName = "TaxReport";
		JasperReport jasperReport;
		//Connection to DB
		String URL = "jdbc:mysql://localhost:3306/SpanishTaxdb";
		String USER = "root";
		String PASS = "root";
		
		
		try {
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		InputStream jasperStream = getClass().getResourceAsStream("/report/TaxReport.jrxml");
		//jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);
		jasperReport = JasperCompileManager.compileReport(jasperStream);
		Map<String, Object> params = new HashMap<String,Object>();
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, conn);
		//JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JRMapArrayDataSource(new Object[] { params }));
		
		response.setContentType("application/pdf");
		response.setHeader("Content-disposition", "inline; filename= "+pdfName+".pdf");
	
		final OutputStream outStream = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(jasperPrint, outStream);
		
		System.out.println("Report Generated Correctly!!");
		}catch (Exception e){
			System.out.println("Error Creating Report --> "+e.getMessage());
			e.printStackTrace();
		}
	}
	

}
