package be.vdab.entiteiten;

import java.util.Calendar;

public class OpenGesloten {

	public static String getBegroeting() {
		
		int dag = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		return (dag == Calendar.TUESDAY || dag== Calendar.THURSDAY?"gesloten":"open");
	}

}
