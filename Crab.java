import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author JeanZhai
 * @version 10/07/2024 19:30pm
 */
public class Crab extends Actor
{
    private int speed = 1;
    private int turnSpeed = -5;
    
    public void act()
    {
        keyInput();
        turnAtEdge();
        checkForCollisions();
    }
    
    public void keyInput()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            move(speed);
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
           turn(turnSpeed);
        }
        
        if(Greenfoot.isKeyDown("shift"))
        {
            speed++;
        }
        
        if(Greenfoot.isKeyDown("h"))
        {
            turnSpeed = turnSpeed + 5;
        }
    }
    
    public void turnAtEdge() 
    {
        if (isAtEdge()) 
        {
            turn(180);
        }
    }
    
    private void checkForCollisions()
    {
        // Check for collision with Lobster
        if (isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
            // Corrected showText call, specifying x and y positions
            getWorld().showText("You Lost!", getWorld().getWidth() / 2, getWorld().getHeight() / 2); // Position at center
        }
    
        // Check for collision with Worm
        if (isTouching(Worm.class)) 
        {
            removeTouching(Worm.class);  // Remove the worm from the world
        }
    
            // Check if all worms are gone
        if (getWorld().getObjects(Worm.class).isEmpty())
        {
                Greenfoot.stop();  // End the game if no worms remain
                System.out.println("You Won!");
                
        }
    }
}
