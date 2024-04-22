package com.example.learnspringboot.cats;

public class Cat {
    private int idCat;
    private String nameCat;
    private String nickNameCat;

    public Cat (int idCat, String nameCat, String nickNameCat){
        this.idCat = idCat;
        this.nameCat = nameCat;
        this.nickNameCat = nickNameCat;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int id) {
        this.idCat = id;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String name) {
        this.nameCat = name;
    }

    public String getNickNameCat() {
        return nickNameCat;
    }

    public void setNickNameCat(String name) {
        this.nickNameCat = name;
    }

    public void printDataCat() {
         System.out.printf("Este es el nombre del gato: %s \n Este es el sobre nombre del gato: %s \n Y este es el identificador del gato: %d", nameCat, nickNameCat, idCat);
    }
}
