package id.code.interviewtest.controllers;

import id.code.interviewtest.models.pendidikan.Pendidikan;
import id.code.interviewtest.services.PendidikanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PendidikanController {
    @Autowired
    PendidikanService service;

    @GetMapping("/pendidikans")
    public List<Pendidikan> getAll(){
        return service.getAll();
    }

    @PostMapping("/pendidikan/insertOrUpdate")
    public Pendidikan insertOrUpdate(@RequestBody Pendidikan request) {
        return insertOrUpdate(request);
    }
}
