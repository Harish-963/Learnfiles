package Interfacesex1;

public interface topSpecialfeatures {

	int price = 100000;

	void waterresistant();

	void price(int price);

	void builtQuality();

//	void countLens();

	default void countLens() {
		System.out.println("Count lens 3");
	}

}
