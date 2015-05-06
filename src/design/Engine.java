package design;

import java.awt.event.ActionListener;


/**
 * This interface specifies how the snake engine runs.
 * 
 * @author Anand
 * */
public interface Engine {

  /**
   * This method listens for a {@code keypress} from the user, which can consist of the following:
   * {@code UP, DOWN, LEFT, RIGHT}. The method will ignore all other keypresses. The method then
   * evolves the game into the next frame.
   * 
   * <p>
   * If the location of the snake head in the next evolution is also where {@code food} is, then the
   * tail of the snake is lengthened by 1 unit.
   * <p>
   * 
   * @param keypress {@code {@link ActionListener}
   * @param food {@code int[][]}
   * @param snake_location {@code int[][]}
   */
  void evolve(ActionListener keypress, int[][] food, int[][] snake_location);

}
