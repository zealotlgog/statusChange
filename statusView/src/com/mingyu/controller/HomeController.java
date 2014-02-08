package com.mingyu.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mingyu.domain.Element;
import com.mingyu.service.ElementService;
import com.mingyu.service.FileService;

@Controller
public class HomeController {

	@Autowired
	private FileService fileService;
	@Autowired
	private ElementService elementService;

	// This function is used to open an excel file and the return a jason array
	// take an file path as a input
	@RequestMapping(value = "/open", method = RequestMethod.POST)
	public ModelAndView showFile(String input) {

		return null;

	}
	
	@ResponseBody
	@RequestMapping(value = "/open", method = RequestMethod.POST)
	public String[] listFileNames(String input) {

		return null;

	}
	

	// This function is used to open an excel file and the return a json array
	// take an file path as a input
	@RequestMapping(value = "/openExcel", method = RequestMethod.POST)
	@ResponseBody
	public List<Element> fileUpload(
			@RequestParam("fileUpload") CommonsMultipartFile file) {
		List<Element> answer = new ArrayList<Element>();

		if (!file.isEmpty()) {
			String path = "./"
					+ file.getOriginalFilename();
			File localFile = new File(path);
			try {
				file.transferTo(localFile);
				answer = fileService.getElementFromExcel(path);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return answer;
	}
}
