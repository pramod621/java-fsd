package coms.phase3AssistedPracticeProject41;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbyService {

    @Autowired
    HobbyRepository hobbyRepository;
    
    public String findByPersonId(int personid){
        return hobbyRepository.findByPersonId(personid);
    }   
    public void addHobby(HobbyEntity he){
        hobbyRepository.save(he);
    }
}

