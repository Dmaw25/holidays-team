package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import beans.Holiday;

public class HolidayDaoImpl implements HolidayDao {

	public static void main(String[] args) {
		

	}
	
	List<Holiday> holidays = new ArrayList<Holiday>();
	
	public List<Holiday> addHolidays() {
		
		LocalDate ChristmasDate = LocalDate.parse("2018-12-25");
		Holiday Christmas = new Holiday("Christmas", ChristmasDate);
		holidays.add(Christmas);

		LocalDate NewYearsDate = LocalDate.parse("2018-01-01");
		Holiday NewYears = new Holiday("New Years", NewYearsDate);
		holidays.add(NewYears);

		LocalDate ValentinesDayDate = LocalDate.parse("2018-02-14");
		Holiday ValentinesDay = new Holiday("Valentine's Day", ValentinesDayDate);
		holidays.add(ValentinesDay);

		LocalDate SPDayDate = LocalDate.parse("2018-03-17");
		Holiday SPDay = new Holiday("Saint Patrick's Day", SPDayDate);
		holidays.add(SPDay);
		
		return holidays;
	}

	@Override
	public Holiday viewHolidaybyDate(LocalDate date) {
		for (Holiday i : holidays) {
			System.out.println(i);
		}
			return null;
	}

	@Override
	public List<Holiday> viewAllHolidays() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Holiday> viewMonthHoliday(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteHoliday(Holiday holiday) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addHoliday(Holiday holiday) {
		// TODO Auto-generated method stub

	}

	@Override
	public Holiday update(Holiday holiday) {
		// TODO Auto-generated method stub
		return null;
	}

}
