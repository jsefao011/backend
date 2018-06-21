package upeu.edu.pe.portalAcademico.controller.tablaMestras;

import com.liquid.restApi.datos.model.Departamento;
import com.liquid.restApi.datos.model.Departamento;
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
@RequestMapping("/api/maestra/departamento")
public class DepartamentoController implements ConsultarBaseController<Departamento> {
    private ConsultarBaseController<Departamento> DepartamentoConsultarBaseController;
    public DepartamentoController() {
        SessionFactory factory = new Hibernate().buildSessionFactory();
        DepartamentoConsultarBaseController = InjectHibernate.injectDepartamentoControllerHibernate(factory);    }
    @RequestMapping(value = "/all", method = RequestMethod.POST)
    @Override
    public List<Departamento> allObjeto() {
        return DepartamentoConsultarBaseController.allObjeto();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @Override
    public Departamento getObjeto(@PathVariable int i) {
        return DepartamentoConsultarBaseController.getObjeto(i);
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Override
    public Departamento save(@RequestBody Departamento Departamento) {
        return DepartamentoConsultarBaseController.save(Departamento);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @Override
    public boolean updateObjecto(@RequestBody Departamento Departamento) {
        return DepartamentoConsultarBaseController.updateObjecto(Departamento);
    }
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @Override
    public boolean deleteObjeto(@RequestBody Departamento Departamento) {
        return DepartamentoConsultarBaseController.deleteObjeto(Departamento);
    }
}
