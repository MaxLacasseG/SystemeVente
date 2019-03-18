import java.utils.Date;

public class Vente {
    Vente(long id, long employeId, Date date, Article[] articlesListe) {

    }

    //Constantes taxes accessibles partout
    public static final float TVQ = 9.975f;
    public static final float TPS = 5f;

    //Variables
    private long id, employeId;
    private float total;
    private Date date;
    private Article[] articlesListe;

    // region SET & GET
    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param employeId the employeId to set
     */
    public void setEmployeId(long employeId) {
        this.employeId = employeId;
    }

    /**
     * @return the employeId
     */
    public long getEmployeId() {
        return employeId;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param articlesListe the articlesListe to set
     */
    public void setArticlesListe(Article[] articlesListe) {
        this.articlesListe = articlesListe;
    }

    /**
     * @return the articlesListe
     */
    public Article[] getArticlesListe() {
        return articlesListe;
    }
    // endregion
}