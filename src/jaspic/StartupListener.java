package jaspic;

import javax.security.auth.message.config.AuthConfigFactory;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class StartupListener implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        AuthConfigFactory factory = AuthConfigFactory.getFactory();
        factory.registerConfigProvider(
    		new TestAuthConfigProvider(), 
    		"HttpServlet", null, 
    		"The test"
    	);
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
