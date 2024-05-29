package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Basic date utils class. All methods are static and be called without
 * instantiating this class.
 * 
 * @author kieran sweetman
 */
public class DateUtils {

	/**
	 * defualt format string
	 */
	public static final String DEFAULT_FORMAT = "dd/MM/yyyy HH:mm:ss";

	/**
	 * format date based on a pattern
	 * 
	 * @param pattern formating type for date (cf {@link SimpleDateFormat})
	 * @param date    the date
	 * @return date in string {@link String}
	 */
	public static String format(String pattern, Date date) {

		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}

	/**
	 * format date with default settings "dd/MM/yyyy HH:mm:ss"
	 * 
	 * @param date date
	 * @return string of formated date with default settings {@link String}
	 */
	public static String formatDefaut(Date date) {

		return format(DEFAULT_FORMAT, date);
	}
}
