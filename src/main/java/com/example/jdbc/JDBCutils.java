/*
*  2019 
*/
package com.example.jdbc;

/**
 * @author wangdan Date: 2019/3/22 Time: 14:56
 * @version $Id$
 */

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCutils {

    private static Connection conn;
    private static ComboPooledDataSource ds = new ComboPooledDataSource();

    public static Connection getConnection() {
        try {
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF8&useServerPrepStmts=true&prepStmtCacheSqlLimit=256&cachePrepStmts=true&prepStmtCacheSize=256&rewriteBatchedStatements=true");
            ds.setUser("root");
            ds.setPassword("123");
            conn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return conn;
    }
}