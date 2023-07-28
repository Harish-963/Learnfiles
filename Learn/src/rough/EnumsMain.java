package rough;

public class EnumsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DaysofWeek day=DaysofWeek.WEDNESDAY;
			
			for(DaysofWeek d:DaysofWeek.values())
			{
				System.out.println(d.ordinal());
			}
	}

}
