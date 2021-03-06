package dao;

import java.time.LocalDate;
import java.util.List;

import beans.Holiday;

public interface HolidayDao {
	public Holiday viewHolidaybyDate(LocalDate date);
	public List<Holiday> viewAllHolidays();
	public List<Holiday> viewMonthHoliday(LocalDate date);
	public void deleteHoliday(Holiday holiday);
	public void addHoliday(Holiday holiday);
	public Holiday update(Holiday holiday);	
}
