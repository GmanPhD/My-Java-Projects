import java.util.HashSet;
import java.util.Set;

/*
1. Inside the Solution class, create a public static Cat class.
2. Implement the createCats method. It must create a Set of cats and add 3 cats to it.
3. In the main method, remove one cat from Set cats.
4. Implement the printCats method. It should display all the cats that remain in the set.
Each cat on a new line.

*/

public class Main {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.toArray()[0]);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {

    }

}

