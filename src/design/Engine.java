package design;

import java.awt.event.ActionListener;


/**
 * This interface specifies how the snake engine runs.
 * 
 * @author adyavanapalli
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
   * @param food {@code boolean[][]}
   * @param snake_location {@code boolean[][]}
   */
  void evolve(ActionListener keypress, boolean[][] food, boolean[][] snake_location);


  /**
   * This method returns a randomly generated location for a food item taking into account the
   * location of the snake.
   * 
   * @param snake_location {@code boolean[][]}
   * @return The location ({@code boolean[][]}) of a food item.
   */
  boolean[][] foodGenerator(boolean[][] snake_location);

  /**
   * This method checks to see if the snake has collided with wall or itself.
   * 
   * <p>
   * Collision with wall: The
   * <p>
   * 
   * @param keypress {@code {@link ActionListener}
   * @param snake_location {@code boolean[][]}
   * 
   */
  boolean checkCollision(ActionListener keypress, boolean[][] snake_location);

}
