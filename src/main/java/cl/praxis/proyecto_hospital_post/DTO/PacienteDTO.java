package cl.praxis.proyecto_hospital_post.DTO;

public class PacienteDTO {
   private String idPaciente;
   private String rut;
   private String nombre;
   private Integer cantDiasHospitalizado;
public PacienteDTO(String idPaciente, String rut, String nombre, Integer cantDiasHospitalizado) {
    this.idPaciente = idPaciente;
    this.rut = rut;
    this.nombre = nombre;
    this.cantDiasHospitalizado = cantDiasHospitalizado;
}
public String getIdPaciente() {
    return idPaciente;
}
public void setIdPaciente(String idPaciente) {
    this.idPaciente = idPaciente;
}
public String getRut() {
    return rut;
}
public void setRut(String rut) {
    this.rut = rut;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public Integer getCantDiasHospitalizado() {
    return cantDiasHospitalizado;
}
public void setCantDiasHospitalizado(Integer cantDiasHospitalizado) {
    this.cantDiasHospitalizado = cantDiasHospitalizado;
}
@Override
public String toString() {
    return "PacienteDTO [idPaciente=" + idPaciente + ", rut=" + rut + ", nombre=" + nombre + ", cantDiasHospitalizado="
            + cantDiasHospitalizado + "]";
}
  
   

   
}
