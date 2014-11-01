package manager;

import datadomain.ResultTO;

public class Manager {
	protected ResultTO warpResult(Object obj, boolean success) {
		ResultTO result = new ResultTO();
		result.setSuccess(success);
		result.setModule(obj);
		return result;
	}
}
