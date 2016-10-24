package com.demo.web.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.demo.util.FileUpload;

@Controller
public class Love {

	@RequestMapping("/love")
	public String love() {
		return "love.html";
	}
	
	@RequestMapping("/editor")
	public String editor() {
		return "editor.html";
	}
	
	@RequestMapping("/upload")
	@ResponseBody
	public String upload(HttpServletRequest  request,MultipartFile wangEditorMobileFile) throws IOException {
		FileUpload.uploadFile(wangEditorMobileFile, "");
		System.out.println("123");
		return "123";
	}
}
