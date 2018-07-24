package util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//clase para obtener el application context
public class BlockbisterContextProvider implements ApplicationContextAware {

	public BlockbisterContextProvider() {
		super();
	}

	//setea el appliction context
	@Override
	public void setApplicationContext(ApplicationContext aContext) throws BeansException {
		BlockbisterApplicationContext.setApplicationContext(aContext);
	}
}