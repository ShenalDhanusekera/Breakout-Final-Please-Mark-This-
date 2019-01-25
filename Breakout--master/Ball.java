import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int speed;
    private int lives;
    private int points;
    private boolean pause = false;

    /**
     * Constructor for objects of class Ball.
     * 
     */
    public Ball()
    {
        speed = 4;
        
        //This makes it so the ball wont go straight up and down or side to side
        do
        {
            setRotation(Greenfoot.getRandomNumber(180));
        } while( (getRotation() > 80 && getRotation() < 100) || getRotation() < 10 || getRotation() > 170);
    }

    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param None There are no parameters 
     * @return Does not return anything
     */
    public void act() 
    {
        ballMovement();
        
        // This was a speed Increaser and Decreaser iw as going to add but it didn't work well so i commented it out
        /**Speed Increaser and Decreaser
         * 
         *  if(Greenfoot.isKeyDown("e"))
         *  {   
         *     if(speed > 0)
         *     {
         *         speed++;
         *      }
         *      else
         *      {
         *          speed--;
         *      }
         *  }
         *  if(Greenfoot.isKeyDown("d"))
         *  {
         *      if(speed < 0)
         *      {
         *          speed++;
         *      }
         *      else
         *      {
         *          speed--;
         *      }
         *  }
         */
    }

    /**
     * ballMovement is the method that sets the boundries of the world so the ball will be able to bouce off, and
     * removes the squares from the world if the ball has been toched. this method also makes the ball bouce off the paddles.
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    private void ballMovement()
    {
        PlayField world = (PlayField) getWorld();
        pause = world.pause;
        if(pause == false)
        {

            lives = getWorld().getObjects(Heart.class).size();
            move(speed);
            if(getX() >= getWorld().getWidth()-10)
            {
                rotate();
                speed = -speed;
                move(speed);
            }
            if(isTouching(Paddles.class))
            {
                rotate();
                setLocation(getX(), getY() - 5);
            }
            if(isTouching(Paddle2.class))
            {
                rotate();
                setLocation(getX(), getY() - 5);
            }
            if(getX() <= 290)
            {
                speed = -speed;
                rotate();
                setRotation(getRotation() + Greenfoot.getRandomNumber(10));
            }
            if(getY() <= 10)
            {
                speed = speed;
                rotate();
            }
            if(isTouching(Square.class))
            {
                getWorld().removeObjects(getIntersectingObjects(Square.class));
                rotate();
                ( (PlayField)getWorld()).update();
                ( (PlayField)getWorld()).updateTwo();
            }
            if(getY() >= 690)
            {
                getWorld().removeObject(getWorld().getObjects(Heart.class).get(getWorld().getObjects(Heart.class).size() - 1));
                getWorld().removeObject(this);
                world.addBall();
            }
        }
    }
    
    /**
     * rotate is the method that allows the ball to rotate
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    private void rotate()
    {
        setRotation(getRotation() * -1);
    }
}
