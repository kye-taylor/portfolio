package com.company;
import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    public static int length;
    public static int height;
    public static int radius;
    public static int base;
    public static int menuchoice = 0;
    public static String shape = "";
    public static int answer;

    public static void main(String[] args) {
        System.out.println("Welcome to the Shape Caluclator.");
        menu();
    }
    public static void menu(){
        System.out.println(" ");
        System.out.println("Please select from the following options:");
        System.out.println("1 - Square");
        System.out.println("2 - Rectangle");
        System.out.println("3 - Circle");
        System.out.println("4 - Triangle");

        Scanner number_input = new Scanner(System.in);
        menuchoice = number_input.nextInt();

        switch (menuchoice) {
            case 1:
                square();
                break;
            case 2:
                rectangle();
                break;
            case 3:
                circle();
                break;
            case 4:
                triangle();
                break;
        }
    }
        public static void square()
        {
            shape = "Square";
            Scanner number_input = new Scanner(System.in);
            System.out.println("Please enter the Length of the sqaure: ");
            length = number_input.nextInt();
            if (length > 0) {

            }
            else if (length < 0) {
                System.out.println("The number needs to be Posative");
                square();
            }
            else {
                System.out.println("The number needs to be Posative");
                square();
            }

            System.out.println("Please enter the Height of the sqaure: ");
            height = number_input.nextInt();
            if (height > 0) {

            }
            else if (height < 0) {
                System.out.println("The number needs to be Posative");
                square();
            }
            else {
                System.out.println("The number needs to be Posative");
                square();
            }
            menuchoice = 0;
            System.out.println("Please select from the following options:");
            System.out.println("1 - Area");
            System.out.println("2 - Perimeter");
            menuchoice = number_input.nextInt();
            switch (menuchoice) {
                case 1:
                    area();
                    break;
                case 2:
                    perimeter();
                    break;
            }
        }
        public static void rectangle()
        {
            shape = "Rectangle";
            Scanner number_input = new Scanner(System.in);
            System.out.println("Please enter the Length of the rectangle: ");
            length = number_input.nextInt();
            if (length > 0) {

            }
            else if (length < 0) {
                System.out.println("The number needs to be Posative");
                rectangle();
            }
            else {
                System.out.println("The number needs to be Posative");
                rectangle();
            }
            System.out.println("Please enter the Height of the rectangle: ");
            height = number_input.nextInt();
            if (height > 0) {

            }
            else if (height < 0) {
                System.out.println("The number needs to be Posative");
                rectangle();
            }
            else {
                System.out.println("The number needs to be Posative");
                rectangle();
            }
            menuchoice = 0;
            System.out.println("Please select from the following options:");
            System.out.println("1 - Area");
            System.out.println("2 - Perimeter");
            menuchoice = number_input.nextInt();
            switch (menuchoice) {
                case 1:
                    area();
                    break;
                case 2:
                    perimeter();
                    break;
            }
        }
        public static void circle()
        {
            shape = "Circle";
            Scanner number_input = new Scanner(System.in);
            System.out.println("Please enter the Radius of the circle: ");
            radius = number_input.nextInt();
            if (radius > 0) {

            }
            else if (radius < 0) {
                System.out.println("The number needs to be Posative");
                circle();
            }
            else {
                System.out.println("The number needs to be Posative");
                circle();
            }
            menuchoice = 0;
            System.out.println("Please select from the following options:");
            System.out.println("1 - Area");
            System.out.println("2 - Perimeter");
            menuchoice = number_input.nextInt();
            switch (menuchoice) {
                case 1:
                    area();
                    break;
                case 2:
                    perimeter();
                    break;
            }
        }
        public static void triangle()
        {
            shape = "Triangle";
            Scanner number_input = new Scanner(System.in);
            System.out.println("Please enter the Base length of the triangle: ");
            base = number_input.nextInt();
            System.out.println("Please enter the Height of the rectangle: ");
            height = number_input.nextInt();
            menuchoice = 0;
            System.out.println("Please select from the following options:");
            System.out.println("1 - Area");
            System.out.println("2 - Perimeter");
            menuchoice = number_input.nextInt();
            switch (menuchoice) {
                case 1:
                    area();
                    break;
                case 2:
                    perimeter();
                    break;
            }
        }
        public static void area(){
            switch(shape){
                case "Square":
                    answer = length * height;
                    System.out.println("The Area of this square is "+answer);
                    break;
                case "Rectangle":
                    answer = length * height;
                    System.out.println("The Area of this rectangle is "+answer);
                    break;
                case "Circle":
                    double answer = Math.PI * radius * radius;
                    System.out.println("The Area of this circle is "+answer);
                    break;
                case "Triangle":
                    answer = base * height / 2;
                    System.out.println("The Area of this triangle is "+answer);
                    break;
            }
            menu();
        }
        public static void perimeter(){
            switch(shape){
                case "Square":
                    answer = length + length + height + height;
                    System.out.println("The Perimeter of this square is "+answer);
                    break;
                case "Rectangle":
                    answer = length + length + height + height;
                    System.out.println("The Perimeter of this rectangle is "+answer);
                    break;
                case "Circle":
                    double answer = 2 * Math.PI * radius;
                    System.out.println("The Perimeter of this circle is "+answer);
                    break;
                case "Triangle":
                    answer = base + base + base;
                    System.out.println("The Perimeter of this triangle is "+answer);
                    break;
            }
            menu();
        }


}

