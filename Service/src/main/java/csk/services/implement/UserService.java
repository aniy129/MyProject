package csk.services.implement;

import csk.dal.jpa.UserRepository;
import csk.entity.database.User;
import csk.service.interfaces.IUserService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Inject
    UserRepository userDal;

    @Override
    public List<User> getAll() {
        Iterable<User> all = userDal.findAll();
        List<User> list = new ArrayList<>();
        all.forEach(list::add);
        return list;
    }
}
