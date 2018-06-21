package upeu.edu.pe.portalAcademico.controller.tablaMestras;

import com.liquid.restApi.datos.model.Distrito;
import com.liquid.restApi.datos.model.Distrito;
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
@RequestMapping("/api/maestra/distrito")
public class DistritoController implements ConsultarBaseController<Distrito> {
    private ConsultarBaseController<Distrito> DistritoConsultarBaseController;
    public DistritoController() {
        SessionFactory factory = new Hibernate().buildSessionFactory();
        DistritoConsultarBaseController = InjectHibernate.injectDistritoControllerHibernate(factory);    }
    @RequestMapping(value = "/all", method = RequestMethod.POST)
    @Override
    public List<Distrito> allObjeto() {
        return DistritoConsultarBaseController.allObjeto();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @Override
    public Distrito getObjeto(@PathVariable int i) {
        return DistritoConsultarBaseController.getObjeto(i);
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public Distrito save(@RequestBody Distrito Distrito) {
        return DistritoConsultarBaseController.save(Distrito);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public boolean updateObjecto(@RequestBody Distrito Distrito) {
        return DistritoConsultarBaseController.updateObjecto(Distrito);
    }
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @Override
    public boolean deleteObjeto(@RequestBody Distrito Distrito) {
        return DistritoConsultarBaseController.deleteObjeto(Distrito);
    }
}
