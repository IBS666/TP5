/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author MSI
 */
public interface MachineLearningModel {
    public void train(Dataset dataset);
    public  double predict(Dataset dataset);
}
