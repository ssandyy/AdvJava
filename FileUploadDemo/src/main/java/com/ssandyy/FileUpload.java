package com.ssandyy;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUpload extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<FileItem> multifiles = sf.parseRequest(request);
			for(FileItem item : multifiles) {
				item.write(new File("C:/ssandyy/javaeclipse/FileUploadDemo/img/"+item.getFieldName()));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
