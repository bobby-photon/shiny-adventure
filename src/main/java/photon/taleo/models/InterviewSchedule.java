/**
 * 
 */
package photon.taleo.models;

import java.util.ArrayList;

/**
 * @author Bobby
 *
 */
public class InterviewSchedule {
	Candidate candidate;
	ArrayList<Interview> interviews;
	
	/**
	 * @return the candidate
	 */
	public Candidate getCandidate() {
		return candidate;
	}
	/**
	 * @param candidate the candidate to set
	 */
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	/**
	 * @return the interviews
	 */
	public ArrayList<Interview> getInterviews() {
		return interviews;
	}
	/**
	 * @param interviews the interviews to set
	 */
	public void setInterviews(ArrayList<Interview> interviews) {
		this.interviews = interviews;
	}
	
	public void addInterview(Interview interview) {
		interviews.add(interview);
	}
	
	public void removeInterview(Interview interview) {
		for(int i = 0; i < interviews.size(); i++) {
			if (interviews.get(i).equals(interview)) {
				interviews.remove(i);
			}
		}
	}	
}
