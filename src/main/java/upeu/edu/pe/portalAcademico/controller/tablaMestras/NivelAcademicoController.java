package upeu.edu.pe.portalAcademico.controller.tablaMestras;

import com.liquid.restApi.datos.model.NivelAcademico;
import com.liquid.restApi.datos.model.NivelAcademico;
import com.liquid.restApi.presentacion.controller.contrato.ConsultarPersonaController;
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
@RequestMapping("/api/maestra/nivelAcademico")
public class NivelAcademicoController implements ConsultarBaseController<NivelAcademico> {
    private ConsultarBaseController<NivelAcademico> NivelAcademicoConsultarBaseController;
    public NivelAcademicoController() {
        SessionFactory factory = new Hibernate().buildSessionFactory();
        NivelAcademicoConsultarBaseController = InjectHibernate.injectNivelAcademicoControllerHibernate(factory);    }
    @RequestMapping(value = "/all", method = RequestMethod.POST)
    @Override
    public List<NivelAcademico> allObjeto() {
        return NivelAcademicoConsultarBaseController.allObjeto();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @Override
    public NivelAcademico getObjeto(@PathVariable int i) {
        return NivelAcademicoConsultarBaseController.getObjeto(i);
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public NivelAcademico save(@RequestBody NivelAcademico NivelAcademico) {
        return NivelAcademicoConsultarBaseController.save(NivelAcademico);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public boolean updateObjecto(@RequestBody NivelAcademico NivelAcademico) {
        return NivelAcademicoConsultarBaseController.updateObjecto(NivelAcademico);
    }
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @Override
    public boolean deleteObjeto(@RequestBody NivelAcademico NivelAcademico) {
        return NivelAcademicoConsultarBaseController.deleteObjeto(NivelAcademico);
    }
}
