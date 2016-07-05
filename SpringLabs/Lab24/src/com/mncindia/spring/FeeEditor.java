package com.mncindia.spring;

import java.beans.PropertyEditorSupport;

public class FeeEditor  extends PropertyEditorSupport{
	
	public void setAsText(String txt) throws IllegalArgumentException {
		String str[]=txt.split(",");
		
		Fee fee=new Fee(Double.parseDouble(str[0]),Double.parseDouble(str[1]),Double.parseDouble(str[2]));
		this.setAsText(txt);
	}

}
