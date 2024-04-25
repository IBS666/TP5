/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author MSI
 */
public class SupportVectorMachine extends BaseModel {
    private int iterations;
    private double learningRate;

    public SupportVectorMachine(String name, int version,double learningRate ) {
        super(name, version);
        this.learningRate=learningRate;
    }


   
    @Override
    public void train(Dataset dataset) {
       System.out.println("train SupportVectorMachine") ;
    }

    @Override
    public double predict(Dataset dataset) {
               

         return (1.0);

    }
    
    
}
