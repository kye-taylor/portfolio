package com.company;

import java.util.Scanner;

public class Main {
    //creating a new serise, inheriting though serise and streaming.
    public static serise brooklyn99 = new serise();
    public static void main(String[] args) {
        controls();
        menu();
    }
    public static void controls() {
        //creating an test, using the "gets" from below.
        System.out.println("Welcome to the Streaming Serives Control Pannel.");
        System.out.println("The Program selected is currently: " + brooklyn99.getTitle());
        System.out.println("Here are the program Details.");
        System.out.println("Title: " + brooklyn99.getTitle());
        System.out.println("Age Raiting: " + brooklyn99.getAgeRating());
        System.out.println("Raiting: " + brooklyn99.getRaiting() + " Star raiting.");
        System.out.println("Genres: " + brooklyn99.getGenre());
        System.out.println("Number of Serie currently on: " + brooklyn99.getNoSerise());
        System.out.println("Number of Episode currently on: " + brooklyn99.getNoEpisode());
    }
    public static void menu() {
        int menuChoice;
        int editInt;
        String menuName;
        String edit;
//creating the menu screen with a number.
        System.out.println("Please select what you want to edit.");
        System.out.println("");
        System.out.println("1 - Title");
        System.out.println("2 - Age Raiting");
        System.out.println("3 - Genre");
        System.out.println("4 - Raiting");
        System.out.println("5 - Serise Number");
        System.out.println("6 - Episode Number");
        System.out.println("");
        Scanner number_input = new Scanner(System.in);
        menuChoice = number_input.nextInt();
//switch statment to navigate though the menus.
        switch (menuChoice) {
            case 1:
                menuName = "Title";
                System.out.println("Please enter the new " + menuName);
                edit = number_input.next();
                brooklyn99.title = edit;
                break;
            case 2:
                menuName = "Age Raiting";
                System.out.println("Please enter the new " + menuName);
                editInt = number_input.nextInt();
                brooklyn99.ageRating = editInt;
                break;
            case 3:
                menuName = "Genre";
                System.out.println("Please enter the new " + menuName);
                edit = number_input.next();
                brooklyn99.genre = edit;
                break;
            case 5:
                menuName = "Raiting";
                System.out.println("Please enter the new " + menuName);
                editInt = number_input.nextInt();
                brooklyn99.raiting = editInt;
                break;
            case 6:
                menuName = "Serise Number";
                System.out.println("Please enter the new " + menuName);
                editInt = number_input.nextInt();
                brooklyn99.noSerise = editInt;
                break;
            case 7:
                menuName = "Episode Number";
                System.out.println("Please enter the new " + menuName);
                editInt = number_input.nextInt();
                brooklyn99.noEpisode = editInt;
                break;
        }
        controls();
    }
}
//creating a parent class, used for inheritance.
class Streaming {
    String title;
    int ageRating;
    String genre;
    int raiting;
//sets the initial vaulues for the program... can be edited.
    Streaming() {
        title = "Brooklyn Nine Nine";
        ageRating = 15;
        genre = "Crime, SitComs, Comedy";
        raiting = 5;
    }
//creating a function to call the individual values.
    String getTitle() {return title;}
    int getAgeRating() {return ageRating;}
    String getGenre() {return genre;}
    int getRaiting() {return raiting;}
}
//creating a child class, inheriting from the streaming class.
class movie extends Streaming {
    double movieLength;
    String movieDiscriptions;
//sets the initial vaulues for the program... can be edited.
    movie() {
        super();
        //super calls the functions created within the parent class.
        movieLength = 1.4;
        movieDiscriptions = "moiveDisc";
    }
//again creating a function to call the individual values.
    double getMovieLength() {return movieLength;}
    String getMovieDiscriptions() {return  movieDiscriptions;}

}
//creating a child class, inheriting from the streaming class.
class serise extends Streaming {
    double seriseLength;
    int noSerise;
    int noEpisode;
//sets the initial vaulues for the program... can be edited.
    serise() {
        super();
        //super calls the functions created within the parent class.
        seriseLength = 0.7;
        noSerise = 1;
        noEpisode = 3;
    }
    //again creating a function to call the individual values.
    double getSeriseLength() {return seriseLength;}
    int getNoSerise() {return noSerise;}
    int getNoEpisode() {return noEpisode;}
}
//creating a child class, inheriting from the streaming class.
class special extends Streaming {
    double movieLength;
    String reasonSpecial;
//sets the initial vaulues for the program... can be edited.
    special() {
        super();
        //super calls the functions created within the parent class.
        movieLength = 1.6;
        reasonSpecial = "Has 1 month of airtime";
    }
    //again creating a function to call the individual values.
    double getMovieLength() {return movieLength;}
    String getReasonSpecial() {return reasonSpecial;}
}
