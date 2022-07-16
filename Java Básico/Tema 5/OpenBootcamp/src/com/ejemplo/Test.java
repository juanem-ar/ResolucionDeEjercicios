package com.ejemplo;


public class Test {
    
    public static void main(String[] args) {
        
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        
        cocheCrud.save();
        cocheCrud.delete();
        cocheCrud.findAll();
    }
}
