package de.cenote.jasperstarter;

public class DatabaseConfig {
    private String dbDriver;
    private String dbUrl;
    private String dbHost;
    private Integer dbPort;
    private String dbName;
    private String dbSid;
    private String dbUser;
    private String dbPasswd;

    /**
     * <p>Getter for the field <code>dbDriver</code>.</p>
     *
     * @return a {@link String} object.
     */
    public String getDbDriver() {
        return dbDriver;
    }

    /**
     * <p>Setter for the field <code>dbDriver</code>.</p>
     *
     * @param value a {@link String} object.
     */
    public void setDbDriver(String value) {
        dbDriver = PropertiesUtils.resolveValueWithEnvVars(value);
    }

    /**
     * <p>Getter for the field <code>dbHost</code>.</p>
     *
     * @return a {@link String} object.
     */
    public String getDbHost() {
        return dbHost;
    }

    /**
     * <p>Setter for the field <code>dbHost</code>.</p>
     *
     * @param value a {@link String} object.
     */
    public void setDbHost(String value) {
        dbHost = PropertiesUtils.resolveValueWithEnvVars(value);
    }

    /**
     * <p>Getter for the field <code>dbName</code>.</p>
     *
     * @return a {@link String} object.
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * <p>Setter for the field <code>dbName</code>.</p>
     *
     * @param value a {@link String} object.
     */
    public void setDbName(String value) {
        dbName = PropertiesUtils.resolveValueWithEnvVars(value);
    }

    /**
     * <p>Getter for the field <code>dbPasswd</code>.</p>
     *
     * @return a {@link String} object.
     */
    public String getDbPasswd() {
        return dbPasswd;
    }

    /**
     * <p>Setter for the field <code>dbPasswd</code>.</p>
     *
     * @param value a {@link String} object.
     */
    public void setDbPasswd(String value) {
        dbPasswd = PropertiesUtils.resolveValueWithEnvVars(value);
    }

    /**
     * <p>Getter for the field <code>dbPort</code>.</p>
     *
     * @return a {@link Integer} object.
     */
    public Integer getDbPort() {
        return dbPort;
    }

    /**
     * <p>Setter for the field <code>dbPort</code>.</p>
     *
     * @param value a {@link Integer} object.
     */
    public void setDbPort(Integer value) {
        dbPort = value;
    }
    public void setDbPort(String value) {
        dbPort = Integer.parseInt(PropertiesUtils.resolveValueWithEnvVars(value));
    }

    /**
     * <p>Getter for the field <code>dbSid</code>.</p>
     *
     * @return a {@link String} object.
     */
    public String getDbSid() {
        return dbSid;
    }

    /**
     * <p>Setter for the field <code>dbSid</code>.</p>
     *
     * @param value a {@link String} object.
     */
    public void setDbSid(String value) {
        dbSid = PropertiesUtils.resolveValueWithEnvVars(value);
    }

    /**
     * <p>Getter for the field <code>dbUrl</code>.</p>
     *
     * @return a {@link String} object.
     */
    public String getDbUrl() {
        return dbUrl;
    }

    /**
     * <p>Setter for the field <code>dbUrl</code>.</p>
     *
     * @param value a {@link String} object.
     */
    public void setDbUrl(String value) {
        dbUrl = PropertiesUtils.resolveValueWithEnvVars(value);
    }

    /**
     * <p>Getter for the field <code>dbUser</code>.</p>
     *
     * @return a {@link String} object.
     */
    public String getDbUser() {
        return dbUser;
    }

    /**
     * <p>Setter for the field <code>dbUser</code>.</p>
     *
     * @param value a {@link String} object.
     */
    public void setDbUser(String value) {
        dbUser = PropertiesUtils.resolveValueWithEnvVars(value);
    }
}
