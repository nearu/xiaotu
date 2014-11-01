package ManagerImpl;

import java.sql.SQLException;

import manager.AccountManager;
import manager.Manager;

import org.springframework.beans.factory.annotation.Autowired;

import dao.AccountDAO;
import datadomain.AccountDO;
import datadomain.ResultTO;

public class AccountManagerImpl extends Manager implements AccountManager {
	@Autowired
	private AccountDAO accountDAO;

	public void insertAccount(AccountDO accountDO) {
		try {
			accountDAO.insertAccount(accountDO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultTO<AccountDO> getAccountByAccountId(String accountId) {
		try {
			AccountDO accountDO = new AccountDO();
			accountDO.setAccountId(accountId);
			return this.warpResult(accountDAO.queryAccount(accountDO), true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this.warpResult(null, false);
	}
}
