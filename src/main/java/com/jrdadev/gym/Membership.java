package com.jrdadev.gym;

import java.time.*;
import java.util.Date;

public class Membership {
    private LocalDate startDate;
    private LocalDate endDate;

    public LocalDate getStartDate(){
        return startDate;
    }
    
    public boolean isVigent() {
    	LocalDate today = DateUtils.dateToLocalDate(new Date());
    	 
    	if(endDate.compareTo(today) >= 0) {
    		return true;
    	}
    	
    	return false;
    }

    public void setStartDate(LocalDate startDate){
        this.startDate = startDate;
    }

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}
