package wine.controller;
import java.util.ArrayList;
import java.util.List;
import wine.model.Wine;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wines")
public class WineController {
    
    @RequestMapping(value = "/{name}/add", method = RequestMethod.PUT)
    public ResponseEntity add(HttpServletResponse response, @PathVariable("name") String name) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Wine> getAll(HttpServletResponse response) {
        List<Wine> wineList = new ArrayList<>();
        wineList.add(new Wine("Aroniowe", 4L));
        return wineList;
    }
}
