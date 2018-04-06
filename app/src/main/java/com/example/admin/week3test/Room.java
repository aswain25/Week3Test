package com.example.admin.week3test;

public class Room
{
    public final boolean isInfected;
    public boolean visited = false;

    Room(boolean infected)
    {
        isInfected = infected;
    }

    public static boolean isOutBreak(Room[][] floor)
    {
        int height = floor.length;
        int width = floor[0].length;

        Node[][] nodes = Node.createNodesFromFloor(floor);

        int maxConnectedCount = 0;

        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++)
            {
                if (!nodes[y][x].room.visited && nodes[y][x].room.isInfected)
                {
                    int currentConnectedCount = getConnectedCountAndSetVisited(nodes[y][x]);
                    if (currentConnectedCount > maxConnectedCount)
                        maxConnectedCount = currentConnectedCount;
                }
            }

        return  maxConnectedCount >= 5;
    }

    public static int getConnectedCountAndSetVisited(Node root)
    {
        int result = 0;
        if (!root.room.isInfected)
            return  result;
        else
        {
            root.room.visited = true;
            if (root.up != null && !root.up.room.visited)
                result += getConnectedCountAndSetVisited(root.up);
            if (root.down != null && !root.down.room.visited)
                result += getConnectedCountAndSetVisited(root.down);
            if (root.left != null && !root.left.room.visited)
                result += getConnectedCountAndSetVisited(root.left);
            if (root.right != null && !root.right.room.visited)
                result += getConnectedCountAndSetVisited(root.right);
            return ++result;
        }
    }


}
