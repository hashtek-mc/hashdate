package fr.hashtek.hashdate;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class HashDate {

    /**
     * Formats a given date following a given format.
     *
     * @param   type    Format type
     * @param   date    Date
     * @return  Formatted date.
     */
    public static String format(HashDateType type, Date date)
    {
        return new SimpleDateFormat(type.getFormat(), Locale.FRANCE).format(date);
    }

}
