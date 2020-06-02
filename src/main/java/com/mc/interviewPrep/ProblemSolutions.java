package com.mc.interviewPrep;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class ProblemSolutions {
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

    //answers
    MathOperation addition = (int a, int b)  -> a + b;
    MathOperation additionNoDeclaration = (a, b) -> a + b;
    MathOperation subtraction = (a, b) -> a - b;
    MathOperation multiplication = (a, b) -> a*b;
    MathOperation division = (a, b) -> a/b;

    //Use lambda expression to iterate through array list of names
    public void iterateThroughListWithLambda(){
        List<String> employees = Arrays.asList("Dave", "Beth", "John", "Seth", "Carson");
        //Iterate through this array using lambda
        employees.forEach(e-> System.out.println(e));
    }

    public void forEachMultiplicationLambda(){
        //Multiply each item in an array by 3
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        numbers.forEach(n-> System.out.println(n*3));
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
        arrayStream = Stream.of(arrayOfMovies);
        System.out.println(arrayStream);
    }

    public void createStreamFromArrayList() {
        //Turn arrayOfMovies > array list > stream;
        List<Movie> movieList = Arrays.asList(arrayOfMovies);
        arrayListStream = movieList.stream();
        System.out.println(arrayListStream);
    }

    public void createStreamUsingStreamOf() {
        //Use Stream.of() to create a stream of movies;
        streamOf = Stream.of(arrayOfMovies[0], arrayOfMovies[1], arrayOfMovies[2], arrayOfMovies[3]);
        System.out.println(streamOf);
    }

    public void createStreamUsingStreamBuilder(){
        //Use Stream.Builder to create a stream of movies;
        Stream.Builder<Movie> movieBuilder = Stream.builder();
        movieBuilder.accept(arrayOfMovies[0]);
        movieBuilder.accept(arrayOfMovies[1]);
        movieBuilder.accept(arrayOfMovies[2]);
        movieBuilder.accept(arrayOfMovies[3]);
        Stream<Movie> movieStreamBuilder = movieBuilder.build();
        System.out.println(movieStreamBuilder);
    }

    public void useCollectorWithArrays(){
        List<String> names = Arrays.asList("Matt", "Nick", "Amber", "Gg", "Kelly");
        //Use .collect to translate names to streamList ***this is the most common way to create streams
        List streamList = names.stream().collect(Collectors.toList());
    }
    public void printStream(){
        List<String> names = Arrays.asList("Matt", "Nick", "Amber", "Gg", "Kelly");
        //Use forEach to print items of names
        names.forEach(System.out::println);
        //Use forEach to print items of arrayStream in reverse order (hint: comparator)
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public void useMapToPerformArithmetic(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //Use forEach & map function to print items of list + 5
        list.stream().map(n -> n+5).forEach(System.out::println);
        //Use forEach & map function to print items of list *3
        list.stream().map(n -> n*3).forEach(System.out::println);
        //Use forEach & map function to print items of list -5
        list.stream().map(n -> n-5).forEach(System.out::println);
    }

    public void useMapToConvertToUppercase(){
        List<String> list = Arrays.asList("Purple", "Yellow", "Red", "Orange", "Pink");
        //Use map to convert list to uppercase
        List upperCaseList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseList);
    }

    public void useFilterToFindStringStartingWithP(){
        List<String> list = Arrays.asList("Purple", "Yellow", "Red", "Orange", "Pink");
        //Use filter to find items starting with the letter P; sysout your answer
        List filteredList = list.stream().filter(p -> p.startsWith("P")).collect(Collectors.toList());
        System.out.println(filteredList);
        //Question: Does the filtered list include Pink & Purple?
    }

    public void useSortedToSortString(){
        List<String> list = Arrays.asList("Dog", "Horse", "Puppy", "Monkey", "Tiger");
        //Use sort to put this list in alphabetical order
        List sortedList = list.stream().sorted().collect(Collectors.toList());
    }

    public void useReduceToFindEvenNumbersInList(){
        List<Integer> list = Arrays.asList(1, 7, 15, 33, 54, 57, 63);
        //Use reduce to find sum  of list
        int sum = list.stream().reduce(0, (a, b) -> a+b );
        System.out.println(sum);
        //Use reduce to print even number in list
        int even = list.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);
    }


    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!FUNCTIONAL INTERFACE SECTION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


}
