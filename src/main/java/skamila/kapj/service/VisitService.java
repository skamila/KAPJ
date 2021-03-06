package skamila.kapj.service;

import skamila.kapj.domain.AppUser;
import skamila.kapj.domain.Visit;

import java.util.List;

public interface VisitService {

    void addVisit(Visit visit);

    List<Visit> listVisits();

    Visit findById(Long visitId);

    List<Visit> findByPatient(AppUser patient);

    List<Visit> findByDoctor(AppUser patient);

    void cancelVisit(long visitId);

    void confirmVisit(long visitId);
}
