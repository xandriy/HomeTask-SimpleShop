package ua.online.courses.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer 
/*extends AbstractAnnotationConfigDispatcherServletInitializer { 
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { WebMVCConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}*/

implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(DatabaseConfig.class);
		webContext.register(WebMVCConfig.class);
		webContext.setServletContext(servletContext);
		webContext.setConfigLocation("ua.online.courses.config");
		servletContext.addListener(new ContextLoaderListener(webContext));
		
		ServletRegistration.Dynamic reg = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(webContext));
		reg.setLoadOnStartup(1);
		reg.addMapping("/");

	}

}
