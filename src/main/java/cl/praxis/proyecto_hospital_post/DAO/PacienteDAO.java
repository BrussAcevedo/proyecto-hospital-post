package cl.praxis.proyecto_hospital_post.DAO;

import java.util.ArrayList;
import java.util.List;

import cl.praxis.proyecto_hospital_post.DTO.PacienteDTO;

public class PacienteDAO {

    public List<PacienteDTO> findAll() {
        List<PacienteDTO> pacientesBBDD = new ArrayList<>();

        PacienteDTO paciente1 = new PacienteDTO("1A", "1111111", "Juan Perez", 10);
        PacienteDTO paciente2 = new PacienteDTO("2B", "2222222", "Maria Gomez", 15);
        PacienteDTO paciente3 = new PacienteDTO("3C", "3333333", "Luis Martinez", 20);
        PacienteDTO paciente4 = new PacienteDTO("4D", "4444444", "Ana Fernandez", 25);
        PacienteDTO paciente5 = new PacienteDTO("5E", "5555555", "Carlos Lopez", 30);
        PacienteDTO paciente6 = new PacienteDTO("6F", "6666666", "Sofia Ramirez", 35);
        PacienteDTO paciente7 = new PacienteDTO("7G", "7777777", "David Sanchez", 40);
        PacienteDTO paciente8 = new PacienteDTO("8H", "8888888", "Laura Torres", 45);
        PacienteDTO paciente9 = new PacienteDTO("9I", "9999999", "Jose Diaz", 50);
        PacienteDTO paciente10 = new PacienteDTO("10J", "1010101", "Marta Ruiz", 55);
        PacienteDTO paciente11 = new PacienteDTO("11K", "1111112", "Pablo Castro", 60);
        PacienteDTO paciente12 = new PacienteDTO("12L", "1212121", "Carmen Vega", 65);
        PacienteDTO paciente13 = new PacienteDTO("13M", "1313131", "Andres Rojas", 70);
        PacienteDTO paciente14 = new PacienteDTO("14N", "1414141", "Elena Suarez", 75);
        PacienteDTO paciente15 = new PacienteDTO("15O", "1515151", "Jorge Herrera", 80);
        PacienteDTO paciente16 = new PacienteDTO("16P", "1616161", "Raquel Morales", 85);
        PacienteDTO paciente17 = new PacienteDTO("17Q", "1717171", "Ricardo Aguilar", 90);
        PacienteDTO paciente18 = new PacienteDTO("18R", "1818181", "Isabel Navarro", 95);
        PacienteDTO paciente19 = new PacienteDTO("19S", "1919191", "Santiago Ortiz", 100);
        PacienteDTO paciente20 = new PacienteDTO("20T", "2020202", "Patricia Romero", 105);

        pacientesBBDD.add(paciente1);
        pacientesBBDD.add(paciente2);
        pacientesBBDD.add(paciente3);
        pacientesBBDD.add(paciente4);
        pacientesBBDD.add(paciente5);
        pacientesBBDD.add(paciente6);
        pacientesBBDD.add(paciente7);
        pacientesBBDD.add(paciente8);
        pacientesBBDD.add(paciente9);
        pacientesBBDD.add(paciente10);
        pacientesBBDD.add(paciente11);
        pacientesBBDD.add(paciente12);
        pacientesBBDD.add(paciente13);
        pacientesBBDD.add(paciente14);
        pacientesBBDD.add(paciente15);
        pacientesBBDD.add(paciente16);
        pacientesBBDD.add(paciente17);
        pacientesBBDD.add(paciente18);
        pacientesBBDD.add(paciente19);
        pacientesBBDD.add(paciente20);

        return pacientesBBDD;
    }
}
