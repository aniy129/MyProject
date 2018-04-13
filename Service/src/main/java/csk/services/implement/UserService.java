package csk.services.implement;

import csk.dal.jpa.UserRepository;
import csk.entity.database.User;
import csk.service.interfaces.IUserService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Inject
    UserRepository userDal;

    @Override
    public List<User> getAll() {
        Pageable pageable=new PageRequest(1,1,Sort.Direction.DESC,"Id");
        List<User> list = userDal.search("",null,pageable).getContent();
//        Iterable<User> all = userDal.findAll();
//        List<User> list = new ArrayList<>();
//        all.forEach(list::add);
        return list;
    }
}
