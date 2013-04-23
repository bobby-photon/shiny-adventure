package com.photon.test;
import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;
import photon.taleo.models.InterviewSchedule;
import photon.taleo.services.Schedule;
import photon.taleo.services.ScheduleImpl;

/**
 * 
 */

/**
 * @author Bobby
 *
 */
public class ScheduleTest extends TestCase {
	@Test
	public void testGetScheduleByReq() {
		
		Schedule scheduler = new ScheduleImpl();		
		ArrayList<InterviewSchedule> interviews = scheduler.getScheduleById(1662);
		
	}
}
