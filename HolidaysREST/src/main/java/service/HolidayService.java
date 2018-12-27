package service;

import java.time.LocalDate;
import java.util.List;

import beans.Holiday;
import dao.HolidayDao;
import dao.HolidayDaoImpl;

public class HolidayService {
	
	HolidayDao hd = new HolidayDaoImpl();
	
	public void addHolidayToList(String name, LocalDate date) {
		hd.addHoliday(new Holiday(name, date));
	}
	
	public Holiday viewHBD(LocalDate date) {
		hd.viewHolidaybyDate(date);
		return null;
		
	}
	
	public List<Holiday> viewAllHol() {
		hd.viewAllHolidays();
		return null;
		
	}
	
	public List<Holiday> viewMonthHol(LocalDate date) {
		hd.viewMonthHoliday(date);
		return null;
		
	}
	public void deleteHol(Holiday holiday) {
		hd.deleteHoliday(holiday);
		
	}
	
	public Holiday updateHoliday(Holiday holiday) {
		hd.update(holiday);
		return holiday;
		
	}
	
	
}
