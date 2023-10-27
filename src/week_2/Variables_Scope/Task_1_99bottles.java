package week_2.Variables_Scope;

//99bottles
//        Използвайте цикъл, за да направите програма, която отпечатва текста на класиката:
//
//        99 bottles of beer on the wall, 99 bottles of beer.
//
//        Take one down and pass it around, 98 bottles of beer on the wall.
//
//        …..
//
//        2 bottles of beer on the wall, 2 bottles of beer.
//
//        Take one down and pass it around, 1 bottle of beer on the wall.
//
//        1 bottle of beer on the wall, 1 bottle of beer.
//
//        Take it down and pass it around, no more bottles of beer on the wall.
//
//        No more bottles of beer on the wall, no more bottles of beer.
//
//        Go to the store and buy some more, 99 bottles of beer on the wall.
//
//        Важно е между всеки стих да има празен ред!

public class Task_1_99bottles {
    public static void main(String[] args) {
        for (int i = 99; i > 1; --i) {
            System.out.printf("%d bottles of beer on the wall, %d bottles of beer.%n", i, i);
            System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.", i - 1);
            System.out.println("\n");
        }
        System.out.println("""
                1 bottle of beer on the wall, 1 bottle of beer.
                Take it down and pass it around, no more bottles of beer on the wall.
                """);
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}
