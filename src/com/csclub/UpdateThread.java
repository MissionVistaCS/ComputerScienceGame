/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.csclub;

import org.lwjgl.opengl.Display;

/**
 *
 * @author ayates
 */
public class UpdateThread extends Thread
{
    @Override
    public void run()
    {
        while (!Display.isCloseRequested())
        {
            System.out.println("test");
        }
    }
}