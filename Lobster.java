import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class defines a lobster. Losbter likes to eat crab
 * @author JeanZhai 
 * @version 10/07/2024 21:04
 */
public class Lobster extends Actor
{
    private int speed = 4;
    
    public void act()
    {
        move(speed);
        turnAtEdge();
    }
    /**
     * Check if the lobster is at the edge of the world. If it is, the lobster will trun. 
     */
     public void turnAtEdge()
     {
         if (isAtEdge()) { 
            turn(17);
     }
        // Add your action code here.
    }
}
