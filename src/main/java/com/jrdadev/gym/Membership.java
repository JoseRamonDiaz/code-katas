package com.jrdadev.gym;

import java.time.*;
import java.util.Date;

public class Membership {
    private Date startDate;
    private Date endDate;

    public Date getStartDate(){
        return startDate;
    }
    
    public boolean isVigent() {
    	LocalDate today = DateUtils.dateToLocalDate(new Date());
    	LocalDate endDateLocal = DateUtils.dateToLocalDate(endDate);
    	 
    	if(endDateLocal.compareTo(today) >= 0) {
    		return true;
    	}
    	
    	return false;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
