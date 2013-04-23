package photon.taleo.services;

public interface Conversion {

	public String getConversionById(String reqId);
		
	public String getConversionByIdAndDate(String reqId, String startDate, String endDate);
	
	public String getConversionByIdAndPhase(String reqId, String phase);
	
	public String getConversionByIdAndDateAndPhase(String reqId, String startDate, String endDate, String phase);
	
	public String getConversionByDate(String startDate, String endDate);
	
	public String getConversionByDateAndPhase(String startDate, String endDate);
	
	public String getConversionByPhase(String phase);		
	
}
