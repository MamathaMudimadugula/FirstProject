package May23rdABSTRACTCLASS;

public class RecipeWithMicroWave extends AbstractRecipe{

	@Override
	void getReday() {
		System.out.println("take Vegtables");
		System.out.println("switch on the Microwne");
	}

	@Override
	void dotheDishes() {
		
		System.out.println("Do cooking");
		System.out.println("put the vegetables in microo");
	}

	@Override
	void cleanup() {
	
		System.out.println("After Eating wash the dishes");
		System.out.println("switch off the Microwne");
	
	}

}
