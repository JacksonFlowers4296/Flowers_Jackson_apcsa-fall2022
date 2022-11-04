//(c) A+ Computer Science


import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WordSortTwoRunner {

  public static void main(String args[]) throws IOException {
    Scanner file = new Scanner(new File("/Users/eggnog/Developer/APCSA/Unit-13/src/wordsorttwo.dat"));
    int size = file.nextInt();
    file.nextLine();
    for (int i = 0; i < size; i++) {
      String sentence = file.nextLine();
      //instantiate a new WordSort
      WordSortTwo wordSort = new WordSortTwo(sentence);
      wordSort.sort();
      System.out.println(wordSort);
    }
  }
}