package Inheritance;

class InheritanceEx2
{
    public static void main(String s[])
    {
    	Entertainment ent1=new Circus();
    	
    
    	//Drama d2 = (Drama) ent1; // LINE A - THROWS ClassCastException
    	Circus c2 = (Circus) ent1; // LINE B - WILL WORK
    }
    
    

}

class Entertainment
{
    String name;
    int numberOfArtists;
    String releaseDate;
    double collectionsFirstWeek;
    double collectionsRestOfTheDays;

    
    
    public Entertainment() {
		
	}

	public Entertainment(String name, int numberOfArtists, String releaseDate, double collectionsFirstWeek,
			double collectionsRestOfTheDays) {
		this.name = name;
		this.numberOfArtists = numberOfArtists;
		this.releaseDate = releaseDate;
		this.collectionsFirstWeek = collectionsFirstWeek;
		this.collectionsRestOfTheDays = collectionsRestOfTheDays;
	}

	double getTotalCollections()
    {
        return collectionsFirstWeek + collectionsRestOfTheDays;
    }

    void printEntertainment()
    {
        System.out.println( name + " got the following collections " );
        System.out.println("First Week : " + collectionsFirstWeek);
        System.out.println("Rest Of The Days : " + collectionsRestOfTheDays);
        System.out.println("Total Collections : " + getTotalCollections());
        System.out.println("Total Artists : " + numberOfArtists);
        System.out.println("Release Date : " + releaseDate);
    }

}

class Movie extends Entertainment
{

	public Movie(String name, int numberOfArtists, String releaseDate, double collectionsFirstWeek,
			double collectionsRestOfTheDays) {
		super(name, numberOfArtists, releaseDate, collectionsFirstWeek, collectionsRestOfTheDays);
		// TODO Auto-generated constructor stub
	}


	public Movie() {
		
	}


	String director;
    String stuntMaster;

    public Movie(String name, int numberOfArtists, String releaseDate, double collectionsFirstWeek,
			double collectionsRestOfTheDays, String director, String stuntMaster) {
		this(name, numberOfArtists, releaseDate, collectionsFirstWeek, collectionsRestOfTheDays);
		this.director = director;
		this.stuntMaster = stuntMaster;
	}





	void print()
    {
        printEntertainment();
        System.out.println("Director : " + director);
        System.out.println("Stunt Master : " + stuntMaster);
    }
}

class Drama extends Entertainment
{
    String writer;
    String stageSetter;


    public Drama() {
		
	}


	public Drama(String name, int numberOfArtists, String releaseDate, double collectionsFirstWeek,
			double collectionsRestOfTheDays, String writer, String stageSetter) {
		super(name, numberOfArtists, releaseDate, collectionsFirstWeek, collectionsRestOfTheDays);
		this.writer = writer;
		this.stageSetter = stageSetter;
	}


	void print()
    {
        printEntertainment();
        System.out.println("Writer : " + writer);
        System.out.println("Stage Setter : " + stageSetter);
    }
}

class Circus extends Entertainment
{
    String ringMaster;

    public Circus() {
		
	}

	public Circus(String name, int numberOfArtists, String releaseDate, double collectionsFirstWeek,
			double collectionsRestOfTheDays, String ringMaster) {
		super(name, numberOfArtists, releaseDate, collectionsFirstWeek, collectionsRestOfTheDays);
		this.ringMaster = ringMaster;
	}

	void print()
    {
        printEntertainment();
        System.out.println("Ring Master : " + ringMaster);
    }
}