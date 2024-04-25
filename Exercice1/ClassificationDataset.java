/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author MSI
 */
public class ClassificationDataset extends Dataset {
     private String[] labels;
      private int numClasses;

    public ClassificationDataset(String path, boolean isTrain) {
        this.path = path;
        this.isTrain = isTrain;
    }

    @Override
    public void chargement() {
        System.out.println("chargement ClassificationDataset");
    }

    @Override
    public void pretraitement() {
        System.out.println("pretraitement ClassificationDataset");
    }
      
}
