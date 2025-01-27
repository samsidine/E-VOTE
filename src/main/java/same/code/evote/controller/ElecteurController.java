package same.code.evote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import same.code.evote.dto.ElecteurDto;
import same.code.evote.service.IelecteurService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ElecteurController {

    @Autowired
    IelecteurService ielecteurService;

    @GetMapping("/electeurs")
    public List<ElecteurDto> electeurs()
    {
        return ielecteurService.electeurs();
    }

    @PostMapping(path = "/electeurs",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ElecteurDto save( ElecteurDto electeurDto){

        return ielecteurService.save(electeurDto);
    }
    @GetMapping("/electeurs/{id}")
    public ElecteurDto getById(@PathVariable(name ="id" ) Long id) {
        return ielecteurService.findById(id);
    }

    @GetMapping("/electeurs/{numElecteur}")
    public ElecteurDto getByNum(@PathVariable(name = "numElecteur") int numElecteur) {
        return ielecteurService.findByNumElecteur(numElecteur);
}

    @DeleteMapping("/electeurs/{id}")
    public void  deleteById(@PathVariable("id") Long id) {

        ielecteurService.deleteById(id);
    }

    @PutMapping("/electeurs")
    public ElecteurDto update(@RequestBody ElecteurDto electeurDto){
        return ielecteurService.update(electeurDto);

    }
}