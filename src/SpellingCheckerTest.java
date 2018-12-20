/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
import java.util.Scanner;

public class SpellingCheckerTest {
    
    public static void main(String[] args)
    {
        SpellingChecker s = new SpellingChecker();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Word:");
        System.out.println();
        String word = scan.nextLine();
        
        s.checkPossible(word, s.initialSearch(word));
    }
}

/** OUTPUT

run:
Enter Word:
fetchingly
*No mistakes found*
BUILD SUCCESSFUL (total time: 1 second)

(a) Add one character to the beginning
run:
Enter Word:
ature
*Mistakes found*
Possible Words:
mature
nature
autre
BUILD SUCCESSFUL (total time: 2 seconds)

(b) Add one character to the end
run:
Enter Word:
timidnes
*Mistakes found*
Possible Words:
timidness
BUILD SUCCESSFUL (total time: 2 seconds)


(c) Remove one character to the beginning
run:
Enter Word:
baardvark
*Mistakes found*
Possible Words:
aardvark
BUILD SUCCESSFUL (total time: 12 seconds)


(d) Remove one character from the end
run:
Enter Word:
mustyy
*Mistakes found*
Possible Words:
musty
BUILD SUCCESSFUL (total time: 4 seconds)

(e) Exchange adjacent characters
run:
Enter Word:
scalloin
*Mistakes found*
Possible Words:
scallion
BUILD SUCCESSFUL (total time: 6 seconds)

 */