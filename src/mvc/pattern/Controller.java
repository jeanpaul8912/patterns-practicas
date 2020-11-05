package mvc.pattern;

public class Controller {

	private Model model;
	
	public Controller(Model model, View view) {
		this.model = model;
		model.addObserver(view);
	}
	
	public void changeName(String newName) {
		model.setName(newName);
	}
}