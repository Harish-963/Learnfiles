package Interfacesex1;

public class MainClasstorunall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		features ikp=new ImplementKeypadPhone();
		ikp.dailing();
		ikp.torch();
		ikp.message();
		ikp.BigScreen();
		
		System.out.println(": \n---------------------------------------\n");
		
		addons ibsp=new ImplementingBudgetSmartPhone();
		ibsp.dailing();
		ibsp.torch();
		ibsp.BigScreen();
		ibsp.Camera();
		ibsp.message();
		ibsp.Touch();
		
		System.out.println("\n---------------------------------------\n");
		
		specialfeatures imrsp=new ImplementingMidRangeSmartPhone();
		imrsp.BigScreen();
		imrsp.Camera();
		imrsp.dailing();
		imrsp.FastCharging();
		imrsp.HighSpeedProcessor();
		imrsp.LiquidCoolingSystem();
		imrsp.message();
		imrsp.torch();
		imrsp.Touch();
		
		System.out.println("\n---------------------------------------\n");
		
		ImplementFlagshipSmartphones ifssp=new ImplementFlagshipSmartphones();
		ifssp.BigScreen();
		ifssp.Camera();;
		ifssp.builtQuality();
		ifssp.dailing();
		ifssp.FastCharging();
		ifssp.HighSpeedProcessor();
		ifssp.LiquidCoolingSystem();
		ifssp.message();
		ifssp.price(topSpecialfeatures.price);
		ifssp.torch();
		ifssp.Touch();
		ifssp.waterresistant();
		ifssp.price(2000);
		ifssp.countLens();
	}

}
