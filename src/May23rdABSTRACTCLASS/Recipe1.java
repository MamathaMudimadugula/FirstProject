package May23rdABSTRACTCLASS;

public class Recipe1 extends AbstractRecipe{

	@Override
	void getReday() {
		System.out.println("take Vegtables");
		System.out.println("cut Vegtables");
	}

	@Override
	void dotheDishes() {
		
		System.out.println("Do cooking");
	}

	@Override
	void cleanup() {
	
		System.out.println("After Eating wash the dishes");
	
	}

}
