package top.simba1949.common;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table country
 */
public class Country {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.countryname
     *
     * @mbg.generated
     */
    private String countryname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.countrycode
     *
     * @mbg.generated
     */
    private String countrycode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.id
     *
     * @return the value of country.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.id
     *
     * @param id the value for country.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.countryname
     *
     * @return the value of country.countryname
     *
     * @mbg.generated
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.countryname
     *
     * @param countryname the value for country.countryname
     *
     * @mbg.generated
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.countrycode
     *
     * @return the value of country.countrycode
     *
     * @mbg.generated
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.countrycode
     *
     * @param countrycode the value for country.countrycode
     *
     * @mbg.generated
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}