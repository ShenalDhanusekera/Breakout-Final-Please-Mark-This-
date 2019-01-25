import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle2 extends Actor
{
    private boolean pause = false;
    private int speed;
    private int speed2;

    /**
     * Constructor for objects of class Paddles.
     * 
     */
    public Paddle2()
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
            //Makes it so the paddle2 won't be able to go out of the world
            if(getX() < 365)
            {
                setLocation(365, getY());
            }
            if(getX() > 907)
            {
                setLocation(907, getY());
            }
        }
    }    

    /**
     * move method is the method that makes the paddle2 move to the left and right
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
