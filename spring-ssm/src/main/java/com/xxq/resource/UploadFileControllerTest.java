package com.xxq.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping
public class UploadFileControllerTest {

	@PostMapping("/test/upload")
	public void test1( MultipartFile multipartFile) throws IOException {
		String originalFilename = multipartFile.getOriginalFilename();
		InputStream inputStream = multipartFile.getInputStream();
		File file = new File("D:/02_document/xx.jpg");
		if (!file.exists()) {
			file.createNewFile();
			FileOutputStream fileOutputStream = new FileOutputStream(file);

			byte [] buf = new byte [1024];
			int read;
			while (( read= inputStream.read(buf)) != -1) {
				fileOutputStream.write(buf);
			}
			fileOutputStream.flush();
			fileOutputStream.close();
			inputStream.close();
		} else {

		}
	}

	@GetMapping("/abc/{id}/dd")
	@ResponseBody
	public void test(@PathVariable Long id, String cb) {

	}
}
