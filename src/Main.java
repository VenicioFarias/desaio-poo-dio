import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.Clock;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso POO");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Script");
        curso2.setDescricao("Curso Script");
        curso2.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java Script");
        mentoria1.setDescricao("Mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}