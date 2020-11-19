package com.laioffer.job.database;

/**
 * @author yutong wang
 * @create 2020-11-01-6:21 PM
 */
public class MySQLDBUtil {
    private static final String INSTANCE = "laiproject-instance.csq3fdnwoin9.us-east-2.rds.amazonaws.com";
    private static final String PORT_NUM = "3306";
    public static final String DB_NAME = "laiproject";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "553650wyt";
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";

}
