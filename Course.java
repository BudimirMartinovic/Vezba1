/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author budimir
 */
public class Course {
    private String name;
    private int numberOfClasses;
    private String codeName;
    
    
public Course(){
    this.name = "";
    this.numberOfClasses = 0;
    this.codeName = "";
}

public String getname (){
    return this.name;
}

public void setname(String customname){
    this.name = customname;
}

public int getnumberOfClasses(){
    return this.numberOfClasses;
}

public void setnumberOfClasses(int customnumberOfClasses){
    this.numberOfClasses = customnumberOfClasses;
}

public String getcodeName (){
    return this.codeName;
}

public void setcodeName(String customcodeName){
    this.codeName = customcodeName;
}
}
