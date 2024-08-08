package cl.praxis.proyecto_hospital_post.DTO;

import java.util.List;

public class PacienteVO {
    
    private String estado;
    public List<PacienteDTO>listaPacientes;

    public PacienteVO (String estado){
        this.estado= estado;
    }

    public PacienteVO (String estado, PacienteDTO pacienteDTO){
        this.estado = estado;

    }
    
    public PacienteVO(String estado, List<PacienteDTO> listaPacientes) {
        this.estado = estado;
        this.listaPacientes = listaPacientes;
 
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public List<PacienteDTO> getListaPacientes() {
        return listaPacientes;
    }


    public void setListaPacientes(List<PacienteDTO> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    @Override
    public String toString() {
        return "PacienteVO [estado=" + estado + ", listaPacientes=" + listaPacientes + ", pacienteDTO="
                + "]";
    }










}
