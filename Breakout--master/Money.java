import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Money extends Actor
{
    private int money;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);
    
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param None There are no parameters
     * @return Does not return anything 
     */
    public void act() 
    {
        //If moeny is less than or equal to 50 the enoughMoney will be equal to true
        if(money <= 50)
        {
            ((PlayField)getWorld()).enoughMoney = true;
        }
    }
    
    /**
     * Constructor for objects of class Money. 
     */
    public Money()
    {
        money = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.setColor(Color.WHITE);
        img.drawString("Money: " + money + "$", 5,25);
        setImage(img);
    }
    
    /**
     * addToMoney is the method that adds money to the scoreboard
     *   
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void addToMoney() 
    {
        money += Greenfoot.getRandomNumber(9)+1;
        GreenfootImage img = getImage();
        img.setColor(Color.WHITE);
        img.clear();
        img.drawString("Money: " + money, 5,25); 
    }  
}
