package csk.web.restful;

import csk.entity.database.Administrators;
import csk.service.interfaces.IAdministratorsService;
import csk.web.exception.ResourceNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "error", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Void> discover()   {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Allow", "OPTIONS,HEAD,GET,POST");
        throw new ResourceNotFoundException();
       // return new ResponseEntity<>(null, headers, HttpStatus.NO_CONTENT);
    }
}
