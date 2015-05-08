package implementation;

import java.awt.event.KeyEvent;
import java.util.Random;

import design.Engine;

public class SnakeEngine implements Engine {

  @Override
  public void evolve(KeyEvent keypress, boolean[][] food, boolean[][] snake_location) {
    // TODO Auto-generated method stub

  }

  @Override
  public int[] foodGenerator(boolean[][] snake_location) {
    Random rand = new Random();
    int length = snake_location.length;

    int x = rand.nextInt(length);
    int y = rand.nextInt(length);

    while (snake_location[x][y]) {
      x = rand.nextInt(length);
      y = rand.nextInt(length);
    }

    return new int[] {x, y};
  }

  @Override
  public boolean checkCollision(KeyEvent keypress, boolean[][] snake_location) {
    // TODO Auto-generated method stub
    return false;
  }

}
