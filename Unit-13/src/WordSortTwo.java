//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import static java.lang.System.*;

import java.util.Arrays;
import java.util.Scanner;

public class WordSortTwo {

  private String[] sussy;

  public WordSortTwo(String sentence) {
    this.sussy = sentence.split(" ");
  }

  public void sort() {
    for (int i = 0; i < this.sussy.length; i++) {
      String lowest = this.sussy[i];
      int loweI= i;

      for (int j = i + 1; j < this.sussy.length; j++) {
        if (this.sussy[j].compareTo(lowest) < 0) {
          lowest = this.sussy[j];
          loweI = j;
        }
      }

      this.sussy[loweI] = this.sussy[i];
      this.sussy[i] = lowest;
    }
  }

  public String toString() {
    String output = "";
    for (int i = 0; i < this.sussy.length; i++) output += this.sussy[i] + "\n";
    return output + "\n\n";
  }
}