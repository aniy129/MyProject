package csk.web.restful;

import csk.entity.database.Administrators;
import csk.service.interfaces.IAdministratorsService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

@Controller
public class AdministratorRest {
    @Inject
    private IAdministratorsService bll;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity get() {
        List<Administrators> admins = bll.getAdmins();
        Administrators administrator = admins.get(0);
        return new ResponseEntity(administrator,new HttpHeaders(),HttpStatus.OK);
    }
}
