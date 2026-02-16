package app.src.main.chaos.layered.models;

public class IngredientInfo {
	public int id;
	public String name;
	public int quantity;

	// @ConstructorParameters({"name","quantity"})
	public IngredientInfo(String name,int quantity){
	this.name = name;
	this.quantity = quantity;
	}
}
