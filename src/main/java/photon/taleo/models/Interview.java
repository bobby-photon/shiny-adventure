/**
 * 
 */
package photon.taleo.models;

import java.util.Date;

/**
 * @author Bobby
 *
 */
public class Interview {
	Interviewer interviewer;
	Date day;
	/**
	 * @return the interviewer
	 */
	public Interviewer getInterviewer() {
		return interviewer;
	}
	/**
	 * @param interviewer the interviewer to set
	 */
	public void setInterviewer(Interviewer interviewer) {
		this.interviewer = interviewer;
	}
	/**
	 * @return the day
	 */
	public Date getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(Date day) {
		this.day = day;
	}

}
