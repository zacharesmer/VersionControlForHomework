package bsu.comp152;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example homework starter code
        // TODO: print "Hello World! This program was written by <your name>"

        //  We can both add a different fruit to this list and see a merge conflict:
        List<String> fruits = Arrays.asList("pineapple", "strawberry", "mango");
        for (String f : fruits){
            System.out.println(f);
        }
    }
}
