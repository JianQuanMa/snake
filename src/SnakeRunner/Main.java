package SnakeRunner;

import java.util.Random;

public class Main {

  public static void main(String[] args) {

    Random rand = new Random();

    double count = 0;
    for (int i = 0; i < 1000000; i++) {
      count += rand.nextDouble();
    }
    count /= 1000000;
    System.out.println(count);


  }
}
