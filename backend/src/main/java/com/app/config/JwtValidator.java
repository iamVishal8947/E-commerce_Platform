package com.app.config;

import java.io.IOException;

import javax.crypto.SecretKey;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class JwtValidator extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String jwt=request.getHeader(JwtConstant.JWT_HEADER);
		
		if(jwt!=null) {
			jwt=jwt.substring(7);
			try {
				//SecretKey key=Keys.
				
			}catch(Exception ex) {
				
			}
		}
	}

}