package id.code.interviewtest.services;

import id.code.interviewtest.models.pendidikan.Pendidikan;
import id.code.interviewtest.models.pendidikan.PendidikanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PendidikanService {
    @Autowired
    PendidikanRepository repository;

    public List<Pendidikan> getAll() {
        return repository.findAll();
    }

    public Pendidikan inserOrUpdate(Pendidikan request) {
        return repository.save(request);
    }
}
