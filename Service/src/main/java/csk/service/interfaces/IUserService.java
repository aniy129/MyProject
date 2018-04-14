package csk.service.interfaces;

import csk.entity.database.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUserService {
    List<User>getAll();
    List<User>search(Pageable pageable);
}
