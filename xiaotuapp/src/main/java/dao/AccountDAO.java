package dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import datadomain.AccountDO;

public class AccountDAO extends DAO {
	public void insertAccount(AccountDO accountDO) throws SQLException {
		try {
			this.getSqlMapClient().insert("AccountDO.insertAccount", accountDO);
		} catch (SQLException e) {
			throw e;
		}
	}

	public AccountDO queryAccount(AccountDO accountDO) throws SQLException {
		Map<String, Object> map = new HashMap<String, Object>();
		if (accountDO.getAccountId() != null) {
			map.put("accountId", accountDO.getAccountId());
		}
		try {
			return (AccountDO) this.getSqlMapClient().queryForObject(
					"AccountDAO.getAccount", map);
		} catch (SQLException e) {
			throw e;
		}
	}
}
