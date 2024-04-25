/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author MSI
 */
public abstract class BaseModel implements MachineLearningModel {
    protected String name ;
    private  int version;
    private  String description;
    private   String device;

    public BaseModel(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public BaseModel(String name) {
        this.name = name;
    }
    
    
    public void displayDetails(){
        System.out.println( "BaseModel{" + "name=" + name + ", version=" + version + ", description=" + description + ", device=" + device + '}');
   }
}
