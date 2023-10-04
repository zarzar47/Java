import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of DLinkedList
        DLinkedList movieList = new DLinkedList();

        // Insert 20 movies into the list with real actors
        MovieCast actors1 = new MovieCast();
        actors1.add("Keanu Reeves");
        actors1.add("Laurence Fishburne");
        actors1.add("Carrie-Anne Moss");
        actors1.add("Hugo Weaving");
        movieList.Insert("The Matrix", "1999", actors1);

        MovieCast actors2 = new MovieCast();
        actors2.add("Tom Hanks");
        actors2.add("Robin Wright");
        actors2.add("Gary Sinise");
        actors2.add("Sally Field");
        movieList.Insert("Forrest Gump", "1994", actors2);

        MovieCast actors3 = new MovieCast();
        actors3.add("Leonardo DiCaprio");
        actors3.add("Kate Winslet");
        actors3.add("Billy Zane");
        actors3.add("Kathy Bates");
        movieList.Insert("Titanic", "1997", actors3);

        MovieCast actors4 = new MovieCast();
        actors4.add("Robert Downey Jr.");
        actors4.add("Chris Evans");
        actors4.add("Scarlett Johansson");
        actors4.add("Chris Hemsworth");
        movieList.Insert("The Avengers", "2012", actors4);

        MovieCast actors5 = new MovieCast();
        actors5.add("Meryl Streep");
        actors5.add("Julia Roberts");
        actors5.add("Ewan McGregor");
        actors5.add("Chris Cooper");
        movieList.Insert("August: Osage County", "2013", actors5);

        MovieCast actors6 = new MovieCast();
        actors6.add("Johnny Depp");
        actors6.add("Orlando Bloom");
        actors6.add("Keira Knightley");
        actors6.add("Geoffrey Rush");
        movieList.Insert("Pirates of the Caribbean: The Curse of the Black Pearl", "2003", actors6);

        MovieCast actors7 = new MovieCast();
        actors7.add("Daniel Radcliffe");
        actors7.add("Emma Watson");
        actors7.add("Rupert Grint");
        actors7.add("Alan Rickman");
        movieList.Insert("Harry Potter and the Sorcerer's Stone", "2001", actors7);

        MovieCast actors8 = new MovieCast();
        actors8.add("Brad Pitt");
        actors8.add("Edward Norton");
        actors8.add("Helena Bonham Carter");
        movieList.Insert("Fight Club", "1999", actors8);

        MovieCast actors9 = new MovieCast();
        actors9.add("Denzel Washington");
        actors9.add("Ethan Hawke");
        actors9.add("Scott Glenn");
        movieList.Insert("Training Day", "2001", actors9);

        MovieCast actors10 = new MovieCast();
        actors10.add("Tom Hanks");
        actors10.add("Matt Damon");
        actors10.add("Tom Sizemore");
        actors10.add("Edward Burns");
        movieList.Insert("Saving Private Ryan", "1998", actors10);

        MovieCast actors11 = new MovieCast();
        actors11.add("Will Smith");
        actors11.add("Tommy Lee Jones");
        actors11.add("Linda Fiorentino");
        movieList.Insert("Men in Black", "1997", actors11);

        MovieCast actors12 = new MovieCast();
        actors12.add("Jodie Foster");
        actors12.add("Anthony Hopkins");
        actors12.add("Scott Glenn");
        movieList.Insert("The Silence of the Lambs", "1991", actors12);

        MovieCast actors13 = new MovieCast();
        actors13.add("Russell Crowe");
        actors13.add("Joaquin Phoenix");
        actors13.add("Connie Nielsen");
        movieList.Insert("Gladiator", "2000", actors13);

        MovieCast actors14 = new MovieCast();
        actors14.add("Liam Neeson");
        actors14.add("Ewan McGregor");
        actors14.add("Natalie Portman");
        movieList.Insert("Star Wars: Episode I - The Phantom Menace", "1999", actors14);

        MovieCast actors15 = new MovieCast();
        actors15.add("Johnny Depp");
        actors15.add("Geoffrey Rush");
        actors15.add("Orlando Bloom");
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
        System.out.println("\nDeleted " + movieToDelete);

        // Display the updated list
        System.out.println(GREEN+"\nUpdated Movie List:"+RESET);
        System.out.println(movieList);

        // Find a movie by title
        Scanner input=new Scanner(System.in);
        System.out.println(GREEN+"Enter the name for the movie to find:"+RESET);
        String movieToFind = input.nextLine();
        Node foundNode = movieList.Find(movieToFind);
        if (foundNode != null) {
            System.out.println("Movie found: " +foundNode);
        } else {
            System.out.println("\nMovie not found: " + movieToFind);
        }
    }
}
