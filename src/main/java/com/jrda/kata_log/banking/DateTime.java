package com.jrda.kata_log.banking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime implements TimeService {
	private DateWrapper dateWrapper;
	
	public DateTime() {
		dateWrapper = new DateWrapper();
	}
	
	@Override
	public String getDate() {
		return formatDate(dateWrapper.getDate());
	}

	protected String formatDate(Date d) {
		String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		return simpleDateFormat.format(d);
	}
	
	protected void setDateWrapper(DateWrapper dateWrapper) { 
		this.dateWrapper = dateWrapper;
	}
}
