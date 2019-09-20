package wine.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    List<Wine> wineList = new ArrayList<>();

    @PostMapping()
    public ResponseEntity add(@RequestBody Wine wine) {
        wineList.add(wine);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping()
    public List<Wine> getAll(HttpServletResponse response) {
        if (wineList.isEmpty()) {
            loadMockData();
        }
        return wineList;
    }

    private void loadMockData() {
        wineList.add(new Wine("Aroniowe", "Kwaśne", 1.0));
        wineList.add(new Wine("Wiśniowe", "Słodkie", 0.75));
        wineList.add(new Wine("Winogronowe", "Słodkie", 0.75));
        wineList.add(new Wine("Jabłkowe", "Słodkie", 0.75));
    }
}
