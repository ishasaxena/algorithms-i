package i.course.intro;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        StdOut.println("algs4 is available");
        String champion = null;
        int i = 1; // position of the current word (1-based)

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            // Select this word with probability 1/i
            if (StdRandom.bernoulli(1.0 / i)) {
                champion = word;
            }
            i++;
        }

        if (champion == null) {
            StdOut.println("No words provided on standard input.");
        } else {
            StdOut.println(champion);
        }
    }
}

