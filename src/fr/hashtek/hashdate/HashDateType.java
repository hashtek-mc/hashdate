package fr.hashtek.hashdate;

public enum HashDateType {

    /* Example date: 05/01/2021 14:17:42 */

    FANCY("EEEE d MMMM yyyy 'à' HH:mm:ss"), // Mardi 05 février 2021 à 14:17:42
    SHORT("dd/MM/yyyy HH:mm:ss");           // 05/01/2021 14:17:42


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
