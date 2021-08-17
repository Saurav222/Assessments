package assessment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Accounts {
	private static Logger logger = LoggerFactory.getLogger(Accounts.class);
	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost/assessment3";
		String DB_USER  = "root";
		String DB_PASSWORD = "Nuvelabs123$";

		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connection.createStatement();) {
//			create(statement); //create
			retrieve(statement);
			update(statement,2,5000);
			Deposit(statement,2,1000);
			Withdraw(statement,2,1000);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private static void create(Statement statement) throws SQLException {
		statement.execute("INSERT INTO ACCOUNTS VALUES(2,'ABC',10000,'17-08-2021','ACTIVE','SAVINGS',2);");
		statement.execute("INSERT INTO ADDRESS VALUES(2,'MUMBAI','MAHARASHTRA',400067,1234567890,221,'BAKER STREET',2);");
		logger.debug("USER CREATED");
	}
	
	private static void update(Statement statement,int id,int amt) throws SQLException {
		statement.executeUpdate("Update ACCOUNTS set BALANCE_AMOUNT = "+amt+" where ACCOUNT_ID = "+id);
	}
	
	private static void retrieve(Statement statement) throws SQLException {
		ResultSet resultSet = statement.executeQuery("SELECT * from ACCOUNTS");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getInt(3));
			
		}
	}
	
	private static void Deposit(Statement statement,int id,int amt) throws SQLException {
		statement.executeUpdate("Update Accounts set balance_amount = balance_amount + "+amt+" where ACCOUNT_ID = "+id);
		logger.debug("DEPOSIT in id "+id);
	}
	private static void Withdraw(Statement statement,int id,int amt) throws SQLException {
		
		statement.executeUpdate("Update Accounts set balance_amount=balance_amount-"+amt+" where balance_amount>="+amt+" and Account_id ="+id );
		logger.debug("WITHDRAWAL from id "+id);
	}
	}