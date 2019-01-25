import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddles extends Actor
{
    private boolean pause = false;
    private int speed;
    private int speed2;

    /**
     * Constructor for objects of class Paddles.
     * 
     */
    public Paddles()
    {
        speed = 4;
        speed2 = -4;
    }

    /**
     * Act - do whatever the Paddles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void act() 
    {
        PlayField world = (PlayField) getWorld();
        pause = world.pause;
        if(pause == false)
        {
            move();
            //Makes it so the paddle won't be able to go out of the world
            if(getX() < 335)
            {
                setLocation(335, getY());
            }
            if(getX() > 937)
            {
                setLocation(937, getY());
            }
        }
    }    

    /**
     * move method is the method that makes the paddles move to the left and right
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    private void move()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(speed);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(speed2);
        }
    }
}
