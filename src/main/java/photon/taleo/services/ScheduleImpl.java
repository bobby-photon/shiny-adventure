package photon.taleo.services;

import java.util.ArrayList;

import photon.taleo.models.InterviewSchedule;

public class ScheduleImpl implements Schedule {

	public String getSchedule() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<InterviewSchedule>  getScheduleById(int reqId) {
		// TODO Auto-generated method stub
		// get all candidates for specified ID getCandidatesByRequisitions
		// For each candidate id get Candidate info getCandidateById
		// for each candidate get interview schedule 
		// getInterviewById
		// for each interview get participants
		//  if participant is candidate ignore if not it's likely interviewer
		// add data to models
		return null;
	}

	public String getScheduleByDate(String startDate, String endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getScheduleByIdAndDate(String reqId, String startDate, String endDate) {
		// TODO Auto-generated method stub
		return null;
	}
}
