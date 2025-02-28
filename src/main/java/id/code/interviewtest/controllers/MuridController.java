package id.code.interviewtest.controllers;

import id.code.interviewtest.models.murid.Murid;
import id.code.interviewtest.services.MuridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MuridController {
    @Autowired
    MuridService muridService;

    @GetMapping("/murids")
    public List<Murid> getAllMurid() {
        return muridService.getAllMurid();
    }

    @PostMapping("/murid/insertOrUpdate")
    public Murid insertOrUpdate(@RequestBody Murid request) {
        return muridService.insertOrUpdate(request);
    }
}
