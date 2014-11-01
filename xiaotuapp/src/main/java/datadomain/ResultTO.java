package datadomain;

public class ResultTO<T> {
	public boolean success;
	public T module;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getModule() {
		return module;
	}

	public void setModule(T module) {
		this.module = module;
	}
}
