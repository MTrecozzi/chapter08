/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Room 
{
    // made private for proper encapsulation
    // the class responsible for the data, should be responsible for providing and changing that data.
    private String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;
    private Room upExit;
    private Room downExit;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
    }
    
    public Room getExit(String direction) {
        
        // replace this with hashMap searching.
        if (direction.equals("north"))
            return northExit;
        if (direction.equals("south"))
            return southExit;
        if (direction.equals("west"))
            return westExit;
        if (direction.equals("east"))
            return eastExit;
        if (direction.equals("up"))
            return upExit;
        if (direction.equals("down"))
            return downExit;
            
            // concretetizing your ductTape.
        
            
        
        return null;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null) {
            northExit = north;
        }
        if(east != null) {
            eastExit = east;
        }
        if(south != null) {
            southExit = south;
        }
        if(west != null) {
            westExit = west;
        }
    }
    
    public void printExits() {
        
        if(northExit != null) {
            System.out.println("north ");
        }
        
        if(southExit != null) {
            System.out.println("south ");
        }
        
        if(westExit != null) {
            System.out.println("west");
        }
        
        if(eastExit != null) {
            System.out.println("east");
        }
        
        
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
