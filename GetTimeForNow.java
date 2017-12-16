package control;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTimeForNow {
	
	public static String getTimeForNow(){
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(date); 
	}
	
}
