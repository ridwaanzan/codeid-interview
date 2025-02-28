package id.code.interviewtest.services;

import id.code.interviewtest.models.murid.Murid;
import id.code.interviewtest.models.murid.MuridRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuridService {
    @Autowired
    MuridRepository muridRepository;

    public List<Murid> getAllMurid() {
        return muridRepository.findAll();
    }

    public Murid insertOrUpdate(Murid request) {
        return muridRepository.save(request);
    }
}
