import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso da linguagem Java com ênfase em Orientação a Objetos.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso da linguagem JavaScript com ênfase em desenvolvimento de aplicações web.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Aconselhamento de como prosseguir com os estudos da linguagem Java.");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java & JavaScript Developer");
        bootcamp.setDescricao("Imersão em Java e JavaScript com cursos, mentorias e desafios de código.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println(devGabriel.getNome() + " - Conteúdos inscritos: "+ devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println(devGabriel.getNome() + " - Conteúdos inscritos: "+ devGabriel.getConteudosInscritos());
        System.out.println(devGabriel.getNome() + " - Conteúdos concluídos: "+ devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());


        System.out.println("-----------------------------------------");

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println(devAna.getNome() + " - Conteúdos inscritos: "+ devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println(devAna.getNome() + " - Conteúdos inscritos: "+ devAna.getConteudosInscritos());
        System.out.println(devAna.getNome() + " - Conteúdos concluídos: "+ devAna.getConteudosConcluidos());
        System.out.println("XP: " + devAna.calcularTotalXp());
    }

}
