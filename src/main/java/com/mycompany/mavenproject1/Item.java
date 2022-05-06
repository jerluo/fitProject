/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.awt.Color;

/**
 *
 * @author jerry
 */

public class Item {
    
    private ItemType type;
    private Fit fit;
    
    // least 0 - 10 most
    private int thickness;
    private int formality;
    
    private Color primaryColor;
    private Color secondaryColor;
    
    public Item(){
        
    }
    
    public boolean isLayer() {
        return type == ItemType.JACKET || type == ItemType.SWEATER;
    }
    
    
}
