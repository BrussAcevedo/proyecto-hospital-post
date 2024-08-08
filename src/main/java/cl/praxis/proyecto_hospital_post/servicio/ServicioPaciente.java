package cl.praxis.proyecto_hospital_post.servicio;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import cl.praxis.proyecto_hospital_post.DAO.PacienteDAO;
import cl.praxis.proyecto_hospital_post.DTO.PacienteDTO;
import cl.praxis.proyecto_hospital_post.DTO.PacienteVO;
@Service
public class ServicioPaciente {



private PacienteDAO pacienteDao = new PacienteDAO();

public PacienteVO listarPacientes(){
    List<PacienteDTO> pacientesBBDD = pacienteDao.findAll();
    PacienteVO pacienteVO;

        if (!pacientesBBDD.isEmpty()){
            pacienteVO = new PacienteVO("Listado de pacientes con datos", pacientesBBDD);
        }else{
            pacienteVO = new PacienteVO("Lista de pacientes Vacía");
        }
        
    return pacienteVO;
}



public PacienteVO buscarPaciente(String busqueda){
    
    List<PacienteDTO> pacientesBBDD = listarPacientes().getListaPacientes();
  
    PacienteVO pacienteEncVO = new PacienteVO("Paciente No Encontrado");

    if (!pacientesBBDD.isEmpty()){
        for (PacienteDTO paciente : pacientesBBDD){

            if (StringUtils.containsAnyIgnoreCase(paciente.getRut(), busqueda) || 
            StringUtils.containsAnyIgnoreCase(paciente.getNombre(), busqueda) ||
            StringUtils.containsAnyIgnoreCase(paciente.getIdPaciente(), busqueda)){

                List<PacienteDTO> pacientesEncontrado = new ArrayList<>();
                pacientesEncontrado.add(paciente);
                pacienteEncVO = new PacienteVO("Paciente Encontrado", pacientesEncontrado); 
        
            }
        }
    }

    return pacienteEncVO;
}

}
