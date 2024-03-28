package fr.hashtek.hashdate;

public enum HashDateType
{

    /* Example date: 05/01/2021 14:17:42 */

    FANCY_DATE_TIME ("EEEE d MMMM yyyy 'à' HH:mm:ss"),  // Mardi 05 février 2021 à 14:17:42
    SHORT_DATE_TIME ("dd/MM/yyyy HH:mm:ss"),            // 05/01/2021 14:17:42
    FANCY_DATE      ("EEEE d MMMM yyyy"),               // Mardi 05 février 2021
    SHORT_DATE      ("dd/MM/yyyy"),                     // 05/01/2021
    TIME            ("HH:mm:ss");                       // 14:17:42


    private final String format;


    /**
     * @param   format  SimpleDateFormat format
     */
    HashDateType(String format)
    {
        this.format = format;
    }


    /**
     * @return  Type's format
     */
    public String getFormat()
    {
        return this.format;
    }

}
