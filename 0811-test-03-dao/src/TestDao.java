import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;

import person.Persons;
import person.PersonsDao;

public class TestDao {
	public static void  main(String[] args) {
		PersonsDao dao = new PersonsDao();
		List<Persons> list = null;
		
		try {
			list = dao.allList();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
	}

}
