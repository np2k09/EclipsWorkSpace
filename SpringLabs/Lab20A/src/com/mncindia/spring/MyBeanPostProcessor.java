package com.mncindia.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	
	public Object postProcessAfterInitialization(Object obj, String bname)
			throws BeansException {
		System.out.println("postProcessAfterInitialization:"+bname);
		return obj;
	}

	
	public Object postProcessBeforeInitialization(Object obj, String bname)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization:"+bname);
		
		
		return obj;
	}

}
