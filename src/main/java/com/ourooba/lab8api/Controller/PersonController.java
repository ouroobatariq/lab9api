package com.ourooba.lab8api.Controller;


import com.ourooba.lab8api.entity.Person;
import com.ourooba.lab8api.repository.service.PersonService;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    private PersonService personService;
    @GetMapping
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
}
@GetMapping("/{id}")
public Person findPersonById(@PathVariable int id){
        return personService.findPersonByID(id);
}
@PostMapping
public Person addPerson(@RequestBody Person person){
   return personService.addPerson(person);
}
@PutMapping("/{id}")
public Person updatePerson(@PathVariable int id,@RequestBody Person person){
        return personService.updatePerson(person,id);
}
 @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable int id){
        personService.deletePerson(id);
 }
}
