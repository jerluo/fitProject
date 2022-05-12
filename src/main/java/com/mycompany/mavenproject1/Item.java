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
    //needs image
    
    // least 0 - 10 most
    private int thickness;
    private int formality;
    
    private Color primaryColor;
    private Color secondaryColor;
    
    public Item(ItemType type, Fit fit, int thickness, int formality, Color primaryColor, Color secondaryColor){
        this.type = type;
        this.fit = fit;
        this.thickness = thickness;
        this.formality = formality;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
    }
    
    public boolean isLayer() {
        return type == ItemType.JACKET || type == ItemType.SWEATER;
    }
    
    
}
