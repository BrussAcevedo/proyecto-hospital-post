package cl.praxis.proyecto_hospital_post.control;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.praxis.proyecto_hospital_post.DTO.PacienteDTO;
import cl.praxis.proyecto_hospital_post.DTO.PacienteVO;
import cl.praxis.proyecto_hospital_post.servicio.ServicioPaciente;

@Controller
public class Controlador {

    @Autowired
    private ServicioPaciente servicioPaciente;
    private static List<PacienteDTO> listaPacientes = new ArrayList<>();

    private Logger logger = LoggerFactory.getLogger("");

    @GetMapping("/")
    public String inicio(Model model) {
        logger.info("Iniciando pagina");
        PacienteVO pacienteVo = servicioPaciente.listarPacientes();
        if (!pacienteVo.getListaPacientes().isEmpty()) {
            listaPacientes.addAll(pacienteVo.getListaPacientes());
            model.addAttribute("listadoPacientes", listaPacientes);

            logger.info("Lista de base de datos encontrada.");

            return "index";
        }
        logger.info("Lista de base de dados no encontrada.");
        model.addAttribute("mensaje", pacienteVo.getEstado());
        return "index";
    }

    @PostMapping("/busqueda")
    public String busqueda(@RequestParam String busquedaTxt, Model model) {
        boolean pacienteNoEncontrado = true;
        String boton = "atras";
        
        PacienteVO pacienteEncontrado = servicioPaciente.buscarPaciente(busquedaTxt);

        if (busquedaTxt != "") {
            logger.info("El dato de busqueda no esta vacío");
            if (pacienteEncontrado.getListaPacientes() != null) {

                model.addAttribute("listadoPacientes", pacienteEncontrado.getListaPacientes());
                model.addAttribute("atras", boton);
                logger.info("Listado encontrado Existosamente");

                return "index";
            }
            logger.info("el dato de entrada Esta Vacío.");
        }
        logger.info("No se encuentra la busqueda solicitada");
        pacienteNoEncontrado = false;
        model.addAttribute("atras", boton);
        model.addAttribute("noEncontrado", pacienteNoEncontrado);
        return "index";
    }

}
