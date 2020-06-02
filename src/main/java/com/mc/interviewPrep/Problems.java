package com.mc.interviewPrep;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Problems {
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LAMBDA EXPRESSION SECTION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    interface MathOperation {
        int operation(int a, int b);
    }

    //For this section, convert the following methods into a lambda expression;
    public void addition(int a, int b){
        System.out.println(a + b);
    }

    public void subtraction(int a, int b){
        System.out.println(a - b);
    }

    public void multiplication(int a, int b){
        System.out.println(a * b);
    }

    public void division(int a, int b) {
        System.out.println(a/b);
    }


    //Use lambda expression to iterate through array list of names
    public void iterateThroughListWithLambda(){
        List<String> employees = Arrays.asList("Dave", "Beth", "John", "Seth", "Carson");
        //Iterate through this array using lambda

    }

    public void forEachMultiplicationLambda(){
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        //Multiply each item in an array by 3

    }



    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!STREAM SECTION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    Stream arrayStream;
    Stream arrayListStream;
    Stream streamOf;
    Stream movieStreamBuilder;
    Movie[] arrayOfMovies = {
            new Movie(1, "Parasite", 3),
            new Movie(2, "Frozen", 4),
            new Movie(3, "I Am Legend", 5),
            new Movie(4, "The Birdcage", 7)
    };

    public void createStreamFromArray() {
        //Turn arrayOfMovies into a stream

    }

    public void createStreamFromArrayList() {
        //Turn arrayOfMovies > array list > stream

    }

    public void createStreamUsingStreamOf() {
        //Use Stream.of() to create a stream of movies;

    }

    public void createStreamUsingStreamBuilder(){
        //Use Stream.Builder to create a stream of movies;

    }

    public void useCollectorWithArrays(){
        List<String> names = Arrays.asList("Matt", "Nick", "Amber", "Gg", "Kelly");
        //Use .collect to translate names to streamList ***this is the most common way to create streams

    }

    public void printStream(){
        List<String> names = Arrays.asList("Matt", "Nick", "Amber", "Gg", "Kelly");
        //Use forEach to print items of name

        //Use forEach to print items of arrayStream in reverse order (hint: comparator)

    }

    public void useMapToPerformArithmetic(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //Use forEach & map function to print items of list + 5

        //Use forEach & map function to print items of list *3

        //Use forEach & map function to print items of list -5

    }

    public void useMapToConvertToUppercase(){
        List<String> list = Arrays.asList("Purple", "Yellow", "Red", "Orange", "Pink");
        //Use map to convert list to uppercase

    }

    public void useFilterToFindStringStartingWithP(){
        List<String> list = Arrays.asList("Purple", "Yellow", "Red", "Orange", "Pink");
        //Use filter to find items starting with the letter P; sysout your answer

        //Question: Does the filtered list include Pink & Purple?
    }

    public void useSortedToSortString(){
        List<String> list = Arrays.asList("Dog", "Horse", "Puppy", "Monkey", "Tiger");
        //Use sort to put this list in alphabetical order

    }

    public void useReduceToFindEvenNumbersInList(){
        List<Integer> list = Arrays.asList(1, 7, 15, 33, 54, 57, 63);
        //Use reduce to find sum  of list

        //Use reduce to print even number in list

    }


    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!FUNCTIONAL INTERFACE SECTION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


}
