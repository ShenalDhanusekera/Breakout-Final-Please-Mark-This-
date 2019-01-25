import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        
        prepare();
        Greenfoot.start();
    }
    
    /**
     * prepare is the method that adds the Breakout title to the Starting screen
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    private void prepare()
    {
        Title title = new Title();
        addObject(title, getWidth()/2, getHeight()/2);
    }
    
    /**
     * Act - do whatever the StartScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void act()
    {
        //If The Enter key is pressed The World will be set to The PlayField
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new PlayField());
        }
    }
}
