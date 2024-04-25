/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author MSI
 */
public class RegressionDataset extends  Dataset {
    private int numFeatures ;
    private  double[] targets;

    public RegressionDataset(String path, boolean isTrain) {
        this.path = path;
        this.isTrain = isTrain;
    }

    @Override
    public void chargement() {
        System.out.println("chargement RegressionDataset");
    }

    @Override
    public void pretraitement() {
        System.out.println("pretraitement RegressionDataset");
    }
    
    
    
    
}
