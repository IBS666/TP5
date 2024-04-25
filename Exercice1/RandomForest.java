/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author MSI
 */
public class RandomForest extends BaseModel{
     private int numTrees;

    public RandomForest(String name, int version, int numTrees) {
        super(name, version);
        this.numTrees = numTrees;
    }

    

    @Override
    public void train(Dataset dataset) {
        System.out.println("RandomForest train") ;
    }

    @Override
    public double predict(Dataset dataset) {
         
         return (2.0);

    }
    
     
     
}
