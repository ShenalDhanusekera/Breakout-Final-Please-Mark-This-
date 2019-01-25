import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);

    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }

    /**
     * Constructor for objects of class Scoreboard. 
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.setColor(Color.WHITE);
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }

    /**
     * addToScore is the method that add score to the scoreboard
     *   
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.setColor(Color.WHITE);
        img.clear();
        img.drawString("Score: " + points, 5,25); 
    }    
}
