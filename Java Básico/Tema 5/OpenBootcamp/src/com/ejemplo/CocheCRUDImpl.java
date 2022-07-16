package com.ejemplo;


public class CocheCRUDImpl implements CocheCRUD{
    
//    CONSTRUCTORES
    public CocheCRUDImpl() {
    }

//    METODOS
    @Override
    public void save() {
        System.out.println("Se ejecutó exitosamente el método save()");
    }

    @Override
    public void findAll() {
        System.out.println("Se ejecutó exitosamente el método findAll()");
    }

    @Override
    public void delete() {
        System.out.println("Se ejecutó exitosamente el método delete()");
    }

    
}
