package LinearSearch;

public class Question1 {
//q?	verify the target element is present in the given string..
public static void main(String[] args) {
	String line= "jhbhsdbjhsdbvhjhbvkjwiejnjn sdk ls";
	char target='l';
	boolean ans=search2(line, target);
	if(ans)
	{
		System.out.println(target+ " -> was found in given line: "+line);
	}
	else
	{
		System.out.println(target+ " -> was not found in given line: "+line);
	}
}


//using for loop..
public static boolean search(String line,char target)
{
	if(line.length()==0)
	{
		return false;
	}
	else
	{
		for(int i=0;i<line.length();i++)
		{
			if(target==line.charAt(i))
			{
				return true;
			}
		}
	}
	return false;
}

//using for each loop..
public static boolean search2(String line,char target)
{
	if(line.length()==0)
	{
		return false;
	}
	else
	{
		for(char c :  line.toCharArray())
		{
			if(target==c)
			{
				return true;
			}
		}
	}
	return false;
}


}
