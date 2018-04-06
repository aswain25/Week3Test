package com.example.admin.week3test;

public class Node
{
    Node up;
    Node down;
    Node left;
    Node right;

    Room room;

    public Node(Room room, Node up, Node down, Node left, Node right)
    {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
        this.room = room;
    }

    public static Node[][] createNodesFromFloor(Room[][] floor)
    {
        int height = floor.length;
        int width = floor[0].length;

        Node[][] nodes = new Node[height][width];
        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++)
                nodes[y][x] = new Node(floor[y][x], null, null, null, null);

        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++)
            {
                nodes[y][x].up = Node.get(nodes, y - 1, x);
                nodes[y][x].down = Node.get(nodes, y + 1, x);
                nodes[y][x].left = Node.get(nodes, y, x - 1);
                nodes[y][x].right = Node.get(nodes, y, x + 1);
            }
            return nodes;
    }

    public static Node get(Node[][] floor, int y, int x)
    {
        int height = floor.length;
        int width = floor[0].length;

        if (0 <= y && y < height && 0 <= x && x < width)
            return floor[y][x];
        else
            return null;
    }
}