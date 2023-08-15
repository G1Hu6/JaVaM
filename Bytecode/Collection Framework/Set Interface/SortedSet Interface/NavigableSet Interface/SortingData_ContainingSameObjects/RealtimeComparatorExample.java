import java.util.*;

class Anime{
	String animeName = null;
	int totalSeasons = 0;
	int releaseYear = 0;

	Anime(String animeName, int totalSeasons, int releaseYear){
		this.animeName = animeName;
		this.totalSeasons = totalSeasons;
		this.releaseYear = releaseYear;
	}

	public String toString(){
		return "{" + animeName + "," +totalSeasons +","+releaseYear +";";
	}
}

class SortByName implements Comparator{
	public int compare(Object obj1, Object obj2){
		return ((Anime)obj1).animeName.compareTo(((Anime)obj2).animeName);
	}
}

class SortByYear implements Comparator{
	public int compare(Object obj1, Object obj2){
		return ((((Anime)obj1).releaseYear) -(((Anime)obj2).releaseYear));
	}
}

class AnimeDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add(new Anime("Pokemon",25,1998));
		al.add(new Anime("Doramon",20,1972));
		al.add(new Anime("LuckyMan",10,2000));

		System.out.println(al);

		Collections.sort(al,new SortByYear());

		System.out.println(al);
	}
}
