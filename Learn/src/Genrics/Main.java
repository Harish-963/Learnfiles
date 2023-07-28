package Genrics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//single parameter
		AllPrinter<Integer> ap=new AllPrinter<>(22);
		//as AllPrinter class parameter T extends Number class so it is giving error. As it allows on integers, flloat and etc... 
//		AllPrinter<String> ap1=new AllPrinter<>("Sai");
//		AllPrinter<Character> ap2=new AllPrinter<>('h');
		ap.printing();
//		ap1.printing();
//		ap2.printing();
		
		
		//multiple parameters
		AllPrintermultiple<Integer,String> apm=new AllPrintermultiple<>(2, "hi");
		AllPrintermultiple<Double,Float> apm1=new AllPrintermultiple<>(2.5, 0.3f);
		AllPrintermultiple<Character,Boolean> apm2=new AllPrintermultiple<>('p', true);
		apm.printing();
		apm2.printing();
		apm1.printing();
	}

}
