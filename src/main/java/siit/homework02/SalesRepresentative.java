package siit.homework02;

public class SalesRepresentative {

    private final String name;
    private final int sales;
    private final int quota;
    private int revenue;


    public SalesRepresentative(String name, int sales, int quota, int revenue) {
        this.name = name;
        this.sales = sales;
        this.quota = quota;
        this.revenue = revenue;
    }

    /***
     * overwrites the print method
     * @return the object prams
     */
    public String toString() {
        return "Name " + name + " Sales " + sales + " Quota " + quota + " Revenue " + revenue;

    }


    /***
     * enable aces to sales param
     * @return sales param of the object
     */
    public int getSales() {
        return sales;
    }

    /***
     * enable aces to quota param
     * @return quota param of the object
     */
    public int getQuota() {
        return quota;
    }

    /***
     * enable aces to revenue param
     * @return revenue param of the object
     */
    public int getRevenue() {

        return revenue;
    }

    /***
     * setting the revenue param of the object
     * @param revenue param of the object
     */
    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }
}
