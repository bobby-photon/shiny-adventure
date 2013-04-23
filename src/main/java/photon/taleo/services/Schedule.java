package photon.taleo.services;

import java.util.ArrayList;

import photon.taleo.models.InterviewSchedule;

public interface Schedule {

	public String getSchedule();
	
	public ArrayList<InterviewSchedule> getScheduleById(int reqId);
	
	public String getScheduleByDate(String startDate, String endDate);
	
	public String getScheduleByIdAndDate(String reqId, String startDate, String endDate);
}
