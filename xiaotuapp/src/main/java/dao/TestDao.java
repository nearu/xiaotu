package dao;


import org.springframework.stereotype.Component;

@Component
public class TestDao extends Dao {


	@SuppressWarnings("deprecation")
	public void getMsg(){
    	System.out.println("123aaaaaaaaaaaaaa");
    	System.out.println("TestDao-ibatis.test");
    	String msg = (String) this.getSqlMapClientTemplate().queryForObject("TestDao.select");
    	System.out.println(msg);
    }
}

