package pro.sky.java.course2.homework21.filippova;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")

public class Controller {
    private final Service service;
    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping ("/add")
    public void add (@RequestParam ("ID") List<Integer> IDs) {
        service.add(IDs);
    }


    @GetMapping("/get")
    public List<Integer> get () {
        return service.get();
    }



}
