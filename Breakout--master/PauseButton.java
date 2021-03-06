import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StopButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseButton extends Actor
{
    /**
     * Act - do whatever the PauseButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //If this Button is pressed the world will be paused and you will not be able to do anything
        if(Greenfoot.mousePressed(this) == true)
        {
            PlayField world = (PlayField) getWorld();
            world.pause = true;
        }
    }    
}
