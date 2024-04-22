package com.example.learnspringboot.cats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatController {
    @Autowired
    private CatService catService;

    @GetMapping("Michis/GetAllMichi")
    public List<Cat> getAllMichi() {
        return catService.getAllCats();
    }

    @PostMapping("Michis/createMichi")
    public ResponseEntity<List<Cat>> createMichorro(@RequestBody Cat cat) {
        catService.addCat(cat);
        // This is a different form to send a ResponseEntity
        // return ResponseEntity.ok(catService.getAllCats());
        return new ResponseEntity<>(catService.getAllCats(), HttpStatus.OK);
    }

    @PostMapping("Michis/updateMichi/{idMichi}")
    public ResponseEntity<List<Cat>> updateMichi(@PathVariable int idMichi, @RequestBody Cat cat) {
        catService.updateCat(cat, idMichi);
        return ResponseEntity.ok(catService.getAllCats());
    }

    @PostMapping("Michis/deleteMichi/{idMichi}")
    public ResponseEntity<List<Cat>> deleteMichi(@PathVariable int idMichi) {
        return new ResponseEntity<>(catService.deleteCat(idMichi), HttpStatus.OK);
    }


}

