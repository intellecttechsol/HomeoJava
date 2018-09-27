package com.homeo.prod.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;
import org.springframework.security.web.csrf.InvalidCsrfTokenException;
import org.springframework.security.web.csrf.MissingCsrfTokenException;

public class CustomAccessDeniedHandler extends AccessDeniedHandlerImpl{

	@Override
	public void handle(HttpServletRequest request,HttpServletResponse response,AccessDeniedException accessDeniedException)	throws IOException, ServletException {
		if (accessDeniedException instanceof MissingCsrfTokenException || accessDeniedException instanceof InvalidCsrfTokenException) {
				response.sendRedirect(request.getContextPath()+"/error403");                                        
		}
		super.handle(request, response, accessDeniedException);
	}
}
