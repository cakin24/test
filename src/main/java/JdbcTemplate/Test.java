package JdbcTemplate;

import java.beans.PropertyVetoException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.List;
import java.util.logging.Logger;

import JdbcTemplate.MemberDao;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

public class Test {
    public static void main( String[] args ) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        MemberDao memberDao = new MemberDao(dataSource);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
