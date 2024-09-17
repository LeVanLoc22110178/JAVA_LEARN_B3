package leloc.com.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import leloc.com.Utils.ConnectDB;

import leloc.com.DAO.IUserDAO;
import leloc.com.models.User;

public class UserDAO implements IUserDAO {

	@Override
	public boolean validate(User user) {
		// TODO Auto-generated method stub
		boolean status = false;

		try (Connection connection = ConnectDB.getConnection();
				PreparedStatement preparedStatement = connection
						.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?")) {
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());

			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return status;
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		String INSERT_USERS_SQL = "INSERT INTO users (username, password, email) VALUES (?, ?, ?);";

		try (Connection connection = ConnectDB.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getEmail());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	

	@Override
	public boolean checkUserExists(String username) {
		boolean exists = false;
		String CHECK_USER_SQL = "SELECT username FROM users WHERE username = ?";

		try (Connection connection = ConnectDB.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(CHECK_USER_SQL)) {
			preparedStatement.setString(1, username);

			ResultSet rs = preparedStatement.executeQuery();
			exists = rs.next(); // Trả về true nếu tìm thấy tên người dùng
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return exists;
	}

	@Override
	public void updatepass(String email, String password) {
	    String UPDATE_USER_SQL = "UPDATE users SET password = ? WHERE email = ?";

	    try (Connection connection = ConnectDB.getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_SQL)) {
	        preparedStatement.setString(1, password);
	        preparedStatement.setString(2, email);

	        // Use executeUpdate for UPDATE statements
	        int rowsAffected = preparedStatement.executeUpdate();
	        if (rowsAffected > 0) {
	            System.out.println("Password updated successfully.");
	        } else {
	            System.out.println("No user found with the provided email.");
	        }
	    } catch (SQLException e) {
	        // Log or handle the SQL exception properly
	        e.printStackTrace();
	    } catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
 

	@Override
	public boolean checkemailExists(String email) {
		boolean duplicate = false;
		String CHECK_USER_SQL = "SELECT username FROM users WHERE email = ?";

		try (Connection connection = ConnectDB.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(CHECK_USER_SQL)) {
			preparedStatement.setString(1, email);

			ResultSet rs = preparedStatement.executeQuery();
			duplicate = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return duplicate;
	}

}