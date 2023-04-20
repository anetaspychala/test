package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )

    {
        //komentarz liniowy

        /* komentarz wieloliniowy
        aaa
        troololololololololololol   Lololo
        ccc
         */

        //drukowanie tekstu
        System.out.println( "Czesc Maciek" );
//2 opcja
        String text = "Nice to meet you";
        System.out.println(text);

        /*
Nawiasy
   okragle -() method and invocation
   Prostokatne =[] collections
   Klamrowe {} - code blocks
   Ostre <> generic types
   "" - string (tekst) - for ex. "Nice to meet You"

typy danych
   Integer - liczba calkowita/whole number
   Float - liczba zmiennoprzecinkowa
   Bool - True lub False
   String - ciag znakow

opertory arytmetyczne
   Integer addition = a + b
   Integer subtraction = a - b
   Integer multiplication = a * b
   Integer Division = a / b
   Integer divisionWithoutFractions = 5/2: // Integer doesn't support fractions
   % - reszta z dzielenia

*///Przyklad Integer
    Integer a = 2;
    Integer b = 5;
    Integer addition = a + b;
    System.out.println(addition);
    /*
operatory logiczne
    && - koniunkcja oba czlony zdania musza byc prawdzie.
    Aneta jest kobieta i dorosla
    || - alternatywa jeden czlon musi byc prawdziwy
    Aneta jest kobieta lub mezczyzna

Float - liczba zmiennoprzecinkowa
    Float x = 0.5f // f at the end is the float identifier

*///Przyklad Float
        Float c = 2.5f;
        Integer d = 2;
        Float multiplication = c * d;
        System.out.println(multiplication);

// Conditional instructions
        //if
        Integer age = 20;
        if (age >18) {// dziala tylko jesli jest TRUE
            System.out.println(age);
        }
//RELATIONSHIP OPERATORS:
    // == EQUALITY OPERATOR
    // != INEQUALITY OPERATOR
    //>= wieksze, rowne
    //<= mniejsze, rowne

//else - we wszystkich innych przypadkach kiedy nie jest spelnione if

        Integer wiek =18;
        if (wiek>=18) {
            System.out.println("Gratulacje masz 18 lat");
        }
        else {
            System.out.println("Sorry nie masz 18 lat:(");
        }
// else if - Jest sprawdzany tylko wtedy, kiedy poprzedzajace go if, jest falszem
        if (wiek>18) {
            System.out.println("Super");
        }
        else if (wiek<=18) {
            System.out.println("Ups");

// Logical conjunction - AND operator (&&)
        if(wiek>12 && wiek<=18) {
            System.out.println("You're the best!");}

// Logical alternative - OR operator (||)
        if(wiek>12 || wiek<6) {
            System.out.println("TAK JEST");}

// MODULO - reszta z dzielenia
            // dla liczby parzystej 4%2==0
            // dla nieparzystej 5%2
        Integer modulo = 5 % 2;
        System.out.println(modulo);

//BOOLEAN - PRAWDA/FALSZ
        Boolean isEven = 4 % 2 == 0;
        System.out.println(isEven);

// USER INPUT - Przyklad z podaniem imienia
            Scanner scanner = new Scanner(System.in);
            System.out.println("What's Your name?");
            String userName = scanner.nextLine(); //Reading Users line of text
            System.out.println("Hello, "+ userName + "!");
//USER INPUT - Przyklad z liczbami
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please write 2 numbers");
            Integer firstNumber = scanner2.nextInt();
            Integer secondNumber = scanner2.nextInt();
            System.out.println(firstNumber +secondNumber);


// ZAJECIA 2

// Algorytm to uporządkowany skończony zbiór instrukcji, które należy wykonać w celu rozwiązania jakiegoś problemu.
//Program to implementacja algorytmu za pomocą języka programowania.
//Programowanie to jest podawanie komputerowi instrukcji do wykonania, w sposób dla niego zrozumiały (tj za pomocą języka programowania).
/*Język programowania to zbiór słów kluczowych oraz zasad składni, który stanowi pośrednika między językiem naturalnym
 a językiem maszynowym. Języki zbliżone do maszynowego są nazywane niskopoziomowymi, a te zbliżone do naturalnego, wysokopoziomowymi.
*/
//Zmienna to "pojemnik" na dane, posiadający typ, nazwę i wartość.
//Typ to informacja o przechowywanych w zmiennej danych. Nadaje danym kontekstu, tj. informuje nas, co dane reprezentują, jak je interpretować, co można z nimi robić.
// INTEGER Typ liczby całkowitej, zajmuje 32 bity w pamięci RAM.
//String to łańcuch znaków, służy do tworzenia tekstu. Rozmiar w pamięci RAM jest uzależniony od jego długości.
//Liczba zmiennoprzecinkowa, o większej precyzji niż Float, ale mniejszej niż Decimal.
//Instrukcja warunkowa to instrukcja, która wykonuje się wyłącznie wtedy, gdy podany warunek jest prawdziwy.



        }
     }
 }
