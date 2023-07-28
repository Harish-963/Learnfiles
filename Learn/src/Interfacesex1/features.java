package Interfacesex1;

public interface features {

	void dailing();

	void message();

	void torch();

	void BigScreen();
}

interface addons extends features {

	void BigScreen();

	void Camera();

	void Touch();
}

interface specialfeatures extends addons, features {
	void HighSpeedProcessor();

	void LiquidCoolingSystem();

	void FastCharging();

	default void countLens() {
		System.out.println("Count lens 4");
	}
}
