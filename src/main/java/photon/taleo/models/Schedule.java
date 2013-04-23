package photon.taleo.models;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Bobby
 *	Class to contain InterviewSchedules.  Implemented as an array of InterviewSchedules's
 */
public class Schedule {
	
	List<InterviewSchedule> schedule = new ArrayList<InterviewSchedule>();
	
	/**
	 * @return the m_schedule
	 */
	public List<InterviewSchedule> getschedule() {
		return schedule;
	}

	/**
	 * @param m_schedule the m_schedule to set
	 */
	public void setschedule(List<InterviewSchedule> schedule) {
		this.schedule = schedule;
	}

	
	
	public void addInterviewSchedule(InterviewSchedule interviewSchedule) {
		schedule.add(interviewSchedule);		
	}
	
	public void removeInterviewSchedule(InterviewSchedule interviewSchedule) {		
		for (int i = 0; i < schedule.size(); i++) {
			if ( schedule.get(i).equals(interviewSchedule)) {
				schedule.remove(i);
			}
		}		
	}

}
