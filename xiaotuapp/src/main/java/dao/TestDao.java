package dao;


import org.springframework.stereotype.Component;

@Component
public class TestDao extends DAO {


	@SuppressWarnings("deprecation")
	public String getMsg(){
    	String msg = (String) this.getSqlMapClientTemplate().queryForObject("TestDao.select");
    	return msg;
    }
}

