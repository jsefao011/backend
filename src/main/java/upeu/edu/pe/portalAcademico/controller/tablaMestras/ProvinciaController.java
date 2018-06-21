package upeu.edu.pe.portalAcademico.controller.tablaMestras;

import com.liquid.restApi.datos.model.Provincia;
import com.liquid.restApi.datos.model.Provincia;
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
@RequestMapping("/api/maestra/provincia")
public class ProvinciaController implements ConsultarBaseController<Provincia> {
    private ConsultarBaseController<Provincia> ProvinciaConsultarBaseController;
    public ProvinciaController() {
        SessionFactory factory = new Hibernate().buildSessionFactory();
        ProvinciaConsultarBaseController = InjectHibernate.injectProvinciaControllerHibernate(factory);    }
    @RequestMapping(value = "/all", method = RequestMethod.POST)
    @Override
    public List<Provincia> allObjeto() {
        return ProvinciaConsultarBaseController.allObjeto();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @Override
    public Provincia getObjeto(@PathVariable int i) {
        return ProvinciaConsultarBaseController.getObjeto(i);
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public Provincia save(@RequestBody Provincia Provincia) {
        return ProvinciaConsultarBaseController.save(Provincia);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public boolean updateObjecto(@RequestBody Provincia Provincia) {
        return ProvinciaConsultarBaseController.updateObjecto(Provincia);
    }
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @Override
    public boolean deleteObjeto(@RequestBody Provincia Provincia) {
        return ProvinciaConsultarBaseController.deleteObjeto(Provincia);
    }
}
