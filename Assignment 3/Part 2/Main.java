import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of DLinkedList
        ListArray movieList = new ListArray();

        // Insert 20 movies into the list with real actors
        MovieCast actors1 = new MovieCast();
        actors1.Insert("Keanu Reeves");
        actors1.Insert("Laurence Fishburne");
        actors1.Insert("Carrie-Anne Moss");
        actors1.Insert("Hugo Weaving");
        movieList.Insert("The Matrix", "1999", actors1);


        MovieCast actors0 = new MovieCast();
        actors0.Insert("Keanu Reeves");
        actors0.Insert("Laurence Fishburne");
        actors0.Insert("Carrie-Anne Moss");
        actors0.Insert("Hugo Weaving");
        movieList.Insert("The Matrix 2", "2003", actors1);

        MovieCast actors2 = new MovieCast();
        actors2.Insert("Tom Hanks");
        actors2.Insert("Robin Wright");
        actors2.Insert("Gary Sinise");
        actors2.Insert("Sally Field");
        movieList.Insert("Forrest Gump", "1994", actors2);

        MovieCast actors3 = new MovieCast();
        actors3.Insert("Leonardo DiCaprio");
        actors3.Insert("Kate Winslet");
        actors3.Insert("Billy Zane");
        actors3.Insert("Kathy Bates");
        movieList.Insert("Titanic", "1997", actors3);

        MovieCast actors4 = new MovieCast();
        actors4.Insert("Robert Downey Jr.");
        actors4.Insert("Chris Evans");
        actors4.Insert("Scarlett Johansson");
        actors4.Insert("Chris Hemsworth");
        movieList.Insert("The Avengers", "2012", actors4);

        MovieCast actors5 = new MovieCast();
        actors5.Insert("Meryl Streep");
        actors5.Insert("Julia Roberts");
        actors5.Insert("Ewan McGregor");
        actors5.Insert("Chris Cooper");
        movieList.Insert("August: Osage County", "2013", actors5);

        MovieCast actors6 = new MovieCast();
        actors6.Insert("Johnny Depp");
        actors6.Insert("Orlando Bloom");
        actors6.Insert("Keira Knightley");
        actors6.Insert("Geoffrey Rush");
        movieList.Insert("Pirates of the Caribbean: The Curse of the Black Pearl", "2003", actors6);

        MovieCast actors7 = new MovieCast();
        actors7.Insert("Daniel Radcliffe");
        actors7.Insert("Emma Watson");
        actors7.Insert("Rupert Grint");
        actors7.Insert("Alan Rickman");
        movieList.Insert("Harry Potter and the Sorcerer's Stone", "2001", actors7);

        MovieCast actors8 = new MovieCast();
        actors8.Insert("Brad Pitt");
        actors8.Insert("Edward Norton");
        actors8.Insert("Helena Bonham Carter");
        movieList.Insert("Fight Club", "1999", actors8);

        MovieCast actors9 = new MovieCast();
        actors9.Insert("Denzel Washington");
        actors9.Insert("Ethan Hawke");
        actors9.Insert("Scott Glenn");
        movieList.Insert("Training Day", "2001", actors9);

        MovieCast actors10 = new MovieCast();
        actors10.Insert("Tom Hanks");
        actors10.Insert("Matt Damon");
        actors10.Insert("Tom Sizemore");
        actors10.Insert("Edward Burns");
        movieList.Insert("Saving Private Ryan", "1998", actors10);

        MovieCast actors11 = new MovieCast();
        actors11.Insert("Will Smith");
        actors11.Insert("Tommy Lee Jones");
        actors11.Insert("Linda Fiorentino");
        movieList.Insert("Men in Black", "1997", actors11);

        MovieCast actors12 = new MovieCast();
        actors12.Insert("Jodie Foster");
        actors12.Insert("Anthony Hopkins");
        actors12.Insert("Scott Glenn");
        movieList.Insert("The Silence of the Lambs", "1991", actors12);

        MovieCast actors13 = new MovieCast();
        actors13.Insert("Russell Crowe");
        actors13.Insert("Joaquin Phoenix");
        actors13.Insert("Connie Nielsen");
        movieList.Insert("Gladiator", "2000", actors13);

        MovieCast actors14 = new MovieCast();
        actors14.Insert("Liam Neeson");
        actors14.Insert("Ewan McGregor");
        actors14.Insert("Natalie Portman");
        movieList.Insert("Star Wars: Episode I - The Phantom Menace", "1999", actors14);

        MovieCast actors15 = new MovieCast();
        actors15.Insert("Johnny Depp");
        actors15.Insert("Geoffrey Rush");
        actors15.Insert("Orlando Bloom");
        movieList.Insert("Pirates of the Caribbean: Dead Man's Chest", "2006", actors15);


        String RESET = "\u001B[0m";
        String GREEN = "\u001B[32m";

        // Display the list
        System.out.println(GREEN+"Initial Movie List:"+RESET);
        System.out.println(movieList);

        // Rest of the operations can remain the same

        // Find and delete a movie
        String movieToDelete = "The Avengers";
        movieList.Delete(movieToDelete);

        // Display the updated list
        System.out.println(GREEN+"\nUpdated Movie List:"+RESET);
        System.out.println(movieList);

        // Find a movie by title
        Scanner input=new Scanner(System.in);
        System.out.println(GREEN+"Enter the name of the movie you want to find"+RESET);
        String movieToFind = input.nextLine();
        System.out.println("Finding movie: "+movieToFind);
        movieList.Find(movieToFind);
    }
}
