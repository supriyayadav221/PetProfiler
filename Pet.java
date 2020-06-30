
package com.skyroute66.petprofiler;

public class Pet {
    
    // properties:
    
    // Task 5: Step 3: change to "protected"
    // Task 1: add two properties:
    private String name ="";
    private int age=0;
    
    
    
    // Task 3: add priviate property ageMultiplier (int)

    
    // constructor
    
    public Pet(String someName, int someAge) {
        // task 1: assign the parameters to the properties name and age
        name=someName;
        age=someAge;

    }

    // Task 3: add another constructor that takes an additional parameter
    // someMultiplier (int) and assign it to the property ageMultiplier
    private int ageMultiplier=1;
    

    // methods
       public Pet(String someName, int someAge, int someMultiplier) {
        // task 1: assign the parameters to the properties name and age
        name=someName;
        age=someAge;
        ageMultiplier=someMultiplier;

    }
    public String selfDescribe() {
        // Task 1: include the name and age properties in the string
        // Task 3: calculate the real age and include it to the string
        return "Hello, my name is "+name+". I am "+claculateRealAge()+"in human year(s) old.";
    }
    
    // Task 3: add a method calculateRealAge()
    public int claculateRealAge(){
    return age* ageMultiplier;
    }
    
    
}
