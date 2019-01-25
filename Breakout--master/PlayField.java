
/**
 * Name: Shenal Dhanusekera
 * Course: Software Development
 * Teacher: Mr.Hardman
 * Date Last Modified: 01/24/2019
 */

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayField extends World
{
    private Scoreboard score;
    private Money money;

    private long startTime = System.currentTimeMillis();
    public boolean pause = false;

    private UpgradePaddle upgrade = new UpgradePaddle();
    public boolean upgradedPaddle = false;

    private UpgradeBall upgrade2 = new UpgradeBall();
    public boolean upgradedBall = false;

    public boolean enoughMoney = false;

    /**
     * Constructor for objects of class PlayField.
     * 
     */
    public PlayField()
    {    
        super(1000, 700, 1);

        prepare();

        score = new Scoreboard();
        addObject( score, 105, 580);

        money = new Money();
        addObject( money, 185, 510);

        startTime = System.currentTimeMillis();
    }

    /**
     * Act - do whatever the PlayField wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void act() 
    {
        startDelay();

        if(getObjects(Square.class).isEmpty() == true)
        {
            Greenfoot.setWorld(new WinScreen());
        }
        
        if(upgradedPaddle == true)
        {
            removeObjects(getObjects(Paddles.class));
        }
    }

    /**
     * prepare is the method that adds all the Square, and all the other Objects to the PlayField.
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    private void prepare()
    {
        addObject(new Heart(), 34, 666);
        addObject(new Heart(), 84, 666);
        addObject(new Heart(), 134, 666);
        addObject(new Heart(), 184, 666);
        addObject(new Heart(), 234, 666);
        addObject(new MoneyIcon(), 60, 515);
        addObject(new ScoreIcon(), 200, 582);
        addObject(new PlayButton(), 70, 30);
        addObject(new PauseButton(), 198, 30);
        addObject(new HomeButton(), 70, 75);
        addObject(new ResetButton(), 198, 75);
        addObject(upgrade, 134, 414);
        addObject(upgrade2, 134, 326);

        for(int y = 0; y < 7; y++)
        {   
            for(int x = 0; x < 14; x++)
            {
                addObject( new Square(), 310 + (x * 50) , 60 + (y * 30));
            }
        }

    }

    /**
     * addBall method is the method that adds the ball to the Playfield
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void addBall()
    {
        if(getObjects(Heart.class).isEmpty() == false)
        {
            addObject( new Ball(), getWidth()/2 +140, getHeight()/2 +75);
            removeObjects(getObjects(Paddles.class));
            removeObjects(getObjects(Paddle2.class));
            upgradedPaddle = false;
            
            addObject( new Paddles(), getWidth()/2 +140, 650);
            Greenfoot.delay(100);
        }
        else
        {
            Greenfoot.setWorld(new GameOverScreen());
        }
    }

    /**
     * startDelay is the method that delays the game when the world is switched to PlayField
     * so the player has some time to get Ready
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    private void startDelay()
    {
        //This makes it so it wont run all the time
        if(System.currentTimeMillis() - startTime < 1000)
        {
            //Makes the ball delayed so it wont spawn right when the game is started
            while((System.currentTimeMillis() - startTime) < 1000)
            {  
            }

            addBall();
        }
    }

    /**
     * update is the method that adds points to the Scoreboard
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void update()
    {
        score.addToScore();
    }

    /**
     * updateTwo is the method that adds points to Money
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void updateTwo()
    {
        money.addToMoney();    
    }
}
