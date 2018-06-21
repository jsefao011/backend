package upeu.edu.pe.portalAcademico.controller.tablaMestras;

import com.liquid.restApi.datos.model.NivelAcademico;
import com.liquid.restApi.datos.model.Religion;
import com.liquid.restApi.datos.model.Religion;
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
@RequestMapping("/api/maestra/religion")
public class ReligionController implements ConsultarBaseController<Religion> {
    private ConsultarBaseController<Religion> ReligionConsultarBaseController;
    public ReligionController() {
        SessionFactory factory = new Hibernate().buildSessionFactory();
        ReligionConsultarBaseController = InjectHibernate.injectReligionControllerHibernate(factory);    }
    @RequestMapping(value = "/all", method = RequestMethod.POST)
    @Override
    public List<Religion> allObjeto() {
        return ReligionConsultarBaseController.allObjeto();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @Override
    public Religion getObjeto(@PathVariable int i) {
        return ReligionConsultarBaseController.getObjeto(i);
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public Religion save(@RequestBody Religion Religion) {
        return ReligionConsultarBaseController.save(Religion);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public boolean updateObjecto(@RequestBody Religion Religion) {
        return ReligionConsultarBaseController.updateObjecto(Religion);
    }
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @Override
    public boolean deleteObjeto(@RequestBody Religion Religion) {
        return ReligionConsultarBaseController.deleteObjeto(Religion);
    }
}
