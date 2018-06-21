package upeu.edu.pe.portalAcademico.controller.tablaMestras;

import com.liquid.restApi.datos.model.Persona;
import com.liquid.restApi.presentacion.controller.contrato.ConsultarPersonaController;
import com.liquid.restApi.presentacion.controller.util.InjectHibernate;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.portalAcademico.util.Hibernate;

import java.util.List;

/**
 * Created by Jse on 21/06/2018.
 */
@RestController
@RequestMapping("/api/maestra/persona")
public class MaestrasPersonaController {
    private ConsultarPersonaController personaController;

    public MaestrasPersonaController() {
        SessionFactory factory = new Hibernate().buildSessionFactory();
        this.personaController = InjectHibernate.injectPersonaControllerHibernate(factory);
    }

    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }

    @RequestMapping(value = "/all", method = RequestMethod.POST)
    public List<Persona> listarPersona() {
        return personaController.allObjeto();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Persona obtenerPersona(@PathVariable int id) {
        return personaController.getObjeto(id);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public Persona guardarPersona(@RequestBody Persona persona) {
        return personaController.save(persona);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public boolean actualizarPersona(@RequestBody Persona persona) {
        return personaController.updateObjecto(persona);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public boolean eliminarPerosona(@RequestBody Persona persona) {
        return personaController.deleteObjeto(persona);
    }

    @RequestMapping(value = "/buscar/{parametros}", method = RequestMethod.POST)
    public List<Persona> BuscarPerosona(@PathVariable String parametros) {
        return personaController.buscarPersona(parametros);
    }
}
