import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends World
{
    /**
     * Constructor for objects of class GameOverScreen.
     * 
     */
    public GameOverScreen()
    {    
        super(1000, 700, 1); 
        
        prepare();
    }
    
    /**
     * prepare is the method adds the GameOverText to the GameOverScreen world
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    private void prepare()
    {
        GameOverText gameovertext = new GameOverText();
        addObject(gameovertext, getWidth()/2, getHeight()/2);
    }
}
