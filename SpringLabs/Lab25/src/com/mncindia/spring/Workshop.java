package com.mncindia.spring;

public class Workshop {
	String topic;
	double fee;
	int nos;
	public Workshop(String topic, double fee, int nos) {
	
		this.topic = topic;
		this.fee = fee;
		this.nos = nos;
	}
	

public String toString() {
	
	String  msg="MNC Acco.....New Workshop";
	msg=msg+"\n topic "+topic;
	msg=msg+"\n fee "+fee;
	msg=msg+"\n nos" +nos;
	return msg;
	
	
	
}
}
