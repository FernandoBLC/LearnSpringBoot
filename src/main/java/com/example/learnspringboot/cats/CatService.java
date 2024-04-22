package com.example.learnspringboot.cats;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CatService {
    private int countCats = 0;
    private static List<Cat> michiCats = new ArrayList<>();

    public List<Cat> getAllCats() {
        return michiCats;
    }

    public Cat getCatById(int idCat) {
        // This for is build like this form
        // Cat is the blueprint of Cats
        // catElement is the element we take from michiCats array
        for (Cat catElement : michiCats) {
            if (catElement.getIdCat() == idCat) {
                return catElement;
            }
        }
        return null;
    }

    public List<Cat> addCat(Cat dataCat) {
        dataCat.setIdCat(michiCats.size() == 0 ? 0 : michiCats.size());
        michiCats.add(dataCat);
        return michiCats;
    }

    public List<Cat> updateCat(Cat dataCat, int idMichi) {
        System.out.println("Esta es la data que recibimos al hacer el update del michi"+ dataCat);
        int index = 0;
        for (Cat catElement : michiCats) {
            if (idMichi == catElement.getIdCat()) {
                dataCat.setIdCat(catElement.getIdCat());
                michiCats.set(index, dataCat);
            }
            index += 1;
        }
        return michiCats;
    }

    public List<Cat> deleteCat(int idCat) {
        int index = 0;
        for (Cat catElement : michiCats) {
            if (catElement.getIdCat() == idCat) {
                michiCats.remove(index);
                break;
            }
            index += 1;
        }
        return michiCats;
    }

}
