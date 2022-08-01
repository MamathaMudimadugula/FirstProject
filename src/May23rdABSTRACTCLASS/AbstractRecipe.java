package May23rdABSTRACTCLASS;

public abstract class AbstractRecipe {
	public void execute() {
		getReday();
		dotheDishes();
		cleanup();
	}
abstract void getReday();
abstract void dotheDishes();
abstract void cleanup();
}
