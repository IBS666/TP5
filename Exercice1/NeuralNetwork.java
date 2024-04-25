/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author MSI
 */
public class NeuralNetwork extends BaseModel{
    private  int[] layers;
    private  String activationFunction;

    public NeuralNetwork(String name, int[] layers, String description) {
        super(name);
        this.layers=layers;
        this.activationFunction= activationFunction;

        
    }
@Override
    public void train(Dataset dataset) {
        System.out.println("NeuralNetwork train") ;
    }

    @Override
    public double predict(Dataset dataset) {
       
        return (3.0);
    }
    
    
}
