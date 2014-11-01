package manager;

import datadomain.AccountDO;
import datadomain.ResultTO;

public interface AccountManager {
	public void insertAccount(AccountDO accountDO);

	public ResultTO<AccountDO> getAccountByAccountId(String accountId);
}
