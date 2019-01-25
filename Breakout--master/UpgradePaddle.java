import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpgradePaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradePaddle extends Actor
{
    /**
     * Act - do whatever the UpgradePaddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //If the Upgrade Button is clicked the Paddle will be added to the World
        if(Greenfoot.mouseClicked(this) == true)
        {
            
            ((PlayField)getWorld()).addObject(new Paddle2(),getWorld().getWidth()/2 +140, 650);
            
            //if(((PlayField)getWorld()).upgradedPaddle  = true)
            //{
                //if(((PlayField)getWorld()).enoughMoney = true)
                //{
                    
                //}
            //}
        }
    }    
}
