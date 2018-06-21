package upeu.edu.pe.portalAcademico.controller.tablaMestras;

import com.liquid.restApi.datos.model.EstadoCivil;
import com.liquid.restApi.datos.model.EstadoCivil;
import com.liquid.restApi.datos.model.NivelAcademico;
import com.liquid.restApi.presentacion.controller.contrato.base.ConsultarBaseController;
import com.liquid.restApi.presentacion.controller.util.InjectHibernate;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.portalAcademico.util.Hibernate;

import java.util.List;

/**
 * Created by Jse on 21/06/2018.
 */
@RestController
@RequestMapping("/api/maestra/estadoCivil")
public class EstadoCivilController implements ConsultarBaseController<EstadoCivil> {
    private ConsultarBaseController<EstadoCivil> EstadoCivilConsultarBaseController;
    public EstadoCivilController() {
        SessionFactory factory = new Hibernate().buildSessionFactory();
        EstadoCivilConsultarBaseController = InjectHibernate.injectEstadoCivilControllerHibernate(factory);    }
    @RequestMapping(value = "/all", method = RequestMethod.POST)
    @Override
    public List<EstadoCivil> allObjeto() {
        return EstadoCivilConsultarBaseController.allObjeto();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @Override
    public EstadoCivil getObjeto(@PathVariable int i) {
        return EstadoCivilConsultarBaseController.getObjeto(i);
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public EstadoCivil save(@RequestBody EstadoCivil EstadoCivil) {
        return EstadoCivilConsultarBaseController.save(EstadoCivil);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public boolean updateObjecto(@RequestBody EstadoCivil EstadoCivil) {
        return EstadoCivilConsultarBaseController.updateObjecto(EstadoCivil);
    }
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @Override
    public boolean deleteObjeto(@RequestBody EstadoCivil EstadoCivil) {
        return EstadoCivilConsultarBaseController.deleteObjeto(EstadoCivil);
    }
}
