package upeu.edu.pe.portalAcademico.controller.tablaMestras;

import com.liquid.restApi.datos.model.NivelAcademico;
import com.liquid.restApi.datos.model.Sexo;
import com.liquid.restApi.datos.model.Sexo;
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
@RequestMapping("/api/maestra/genero")
public class SexoController implements ConsultarBaseController<Sexo> {
    private ConsultarBaseController<Sexo> SexoConsultarBaseController;

    public SexoController() {
        SessionFactory factory = new Hibernate().buildSessionFactory();
        SexoConsultarBaseController = InjectHibernate.injectSexoControllerHibernate(factory);
    }

    @RequestMapping(value = "/all", method = RequestMethod.POST)
    @Override
    public List<Sexo> allObjeto() {
        return SexoConsultarBaseController.allObjeto();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @Override
    public Sexo getObjeto(@PathVariable int i) {
        return SexoConsultarBaseController.getObjeto(i);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public Sexo save(@RequestBody Sexo Sexo) {
        return SexoConsultarBaseController.save(Sexo);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public boolean updateObjecto(@RequestBody Sexo Sexo) {
        return SexoConsultarBaseController.updateObjecto(Sexo);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @Override
    public boolean deleteObjeto(@RequestBody Sexo Sexo) {
        return SexoConsultarBaseController.deleteObjeto(Sexo);
    }
}
