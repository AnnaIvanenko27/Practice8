package ua.nure.ivanenko.Practice8;

import static org.mockito.Mockito.*;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;
import ua.nure.ivanenko.Practice8.db.*;
import ua.nure.ivanenko.Practice8.db.entity.User;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

//@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
	@Rule public MockitoRule mockito = MockitoJUnit.rule();
	
	@Mock DBManager dbManager;
	
	@Test
	public void addUser() {

		User user = spy(User.createUser("Otto"));
		try {
			dbManager.insertUser(user);
			List list = dbManager.findAllUsers();
			verify(dbManager).insertUser(user);
			doReturn(list).when(dbManager).findAllUsers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
