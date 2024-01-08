/**
 * Provides the classes necessary to calculate scores in a Yacht (similar to Yahtzee) game.
 *
 * <p>This package includes the main class {@link yacht.Yacht} which is used to
 * calculate the score based on the dice values and the chosen scoring category.
 * The scoring categories are defined in the {@link yacht.YachtCategory} enum.
 *
 * <p>Usage example:
 * <pre>
 *     Yacht yacht = new Yacht(new int[]{1, 1, 1, 1, 1}, YachtCategory.YACHT);
 *     int score = yacht.score();
 * </pre>
 *
 * @since 1.0
 */
package yacht;
