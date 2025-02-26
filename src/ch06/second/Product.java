package ch06.second;

public class Product<T, M> {

	private T product;
	private M model;
	
	public T getProduct() {
		return product;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

	public void setProduct(T product) {
		this.product = product;
	}
	
}
