package com.udemy.backendNinja1.component;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.udemy.backendNinja1.repository.LogRepository;


@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter {
private static final Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);
	//4
	@Autowired
	@Qualifier("logRepository")
	private LogRepository logRepository;
	//Incorporamos los Métodos desde Source>>OverrideMethods y elegimos preHandle y afterCompletion
	
	//Se Ejecuta en Primer Lugar
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("startTime", System.currentTimeMillis());
		return true;
	}
	//Se Ejecuta en Segundo Lugar
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long startTime = (long) request.getAttribute("startTime");
		
		//3 Modificación
		String url = request.getRequestURL().toString();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = ""; //Eliminamos id del Constructor en la clase Log//
		if(null !=auth && auth.isAuthenticated()) {
			username = auth.getName();
		}
		//5
		logRepository.save(new com.udemy.backendNinja1.entity.Log(new Date(),
				auth.getDetails().toString(),username,url));
		logRepository.save(new com.udemy.backendNinja1.entity.Log());
		LOG.info("URL to: '"+url+"' in: '"+(System.currentTimeMillis() - startTime)+"ms'" );
		/*LOG.info("--URL: '" +request.getRequestURL().toString()+ "'--TOTAL TIME: '"+(System.currentTimeMillis() - startTime)+"'ms'");*/
	}	
}
