package com.example.admin.week3test;

public class EpidemicTester
{
    public static void main(String[] args)
    {
            System.out.println("test print");

        Room[][] verticalTrue = new Room[][] {  {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) } };
        Room[][] horizontalTrue = new Room[][] { {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(true), new Room(true), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) } };
        Room[][] noInfection = new Room[][] { {new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) } };

        Room[][] squareInfection = new Room[][]
                {
                        {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false),},
                        {new Room(false), new Room(true), new Room(true), new Room(true), new Room(false),},
                        {new Room(false), new Room(true), new Room(true), new Room(true), new Room(false),},
                        {new Room(false), new Room(true), new Room(true), new Room(true), new Room(false),},
                        {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false),},
                };
        Room[][] blobInfection = new Room[][]
                {
                        {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false),},
                        {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false),},
                        {new Room(false), new Room(true), new Room(true), new Room(false), new Room(false),},
                        {new Room(false), new Room(true), new Room(true), new Room(true), new Room(false),},
                        {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false),},
                };

        System.out.println("vertical should be true: " + Room.isOutBreak(verticalTrue));
        System.out.println("horizontal should be true: " + Room.isOutBreak(horizontalTrue));
        System.out.println("noInfection should be false: " + Room.isOutBreak(horizontalTrue));
        System.out.println("squareInfection should be true: " + Room.isOutBreak(squareInfection));
        System.out.println("blobInfection should be true: " + Room.isOutBreak(blobInfection));
    }
}
