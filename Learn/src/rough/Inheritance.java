package rough;



class Inheritance
{
    public static void main(String s[])
    {
        Movie julai = new Movie("Julai",57,"15-Aug-2012",215467.8,541132.5,"Trivikram","Peter Hein");
        
        Drama ramayan = new Drama("Ramayana",200000,"17-Mar-1659 BC",3282937242.86,93488272349.51,"Valmiki","Anjaneya");

        Circus jumbo = new Circus("Jumbo",316,"16-Dec-1997",2123132.21,234936725.09,"Antony");
    
    
        compareEntertainments(julai, ramayan, jumbo);
        
    }
    
    public static void compareEntertainments(Movie ent1, Entertainment ent2, Entertainment ent3)
    {
    if((ent1.getTotalCollections() > ent2.getTotalCollections()) && (ent1.getTotalCollections() > ent3.getTotalCollections()))
        {
            System.out.println(ent1.name + " has the highest collections.");
        }
        else if (ent2.getTotalCollections() > ent3.getTotalCollections())
        {
            System.out.println(ent2.name + " has the highest collections.");
        }
        else
        {
            System.out.println(ent3.name + " has the highest collections.");
        }
    }

}

class Entertainment
{
    String name;
    int numberOfArtists;
    String releaseDate;
    double collectionsFirstWeek;
    double collectionsRestOfTheDays;

    
    
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