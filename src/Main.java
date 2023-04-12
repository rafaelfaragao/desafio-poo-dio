import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos por " + devRafael.getNome()+ " são " + devRafael.getConteudosInscritos());

        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos por " + devRafael.getNome()+ " são " + devRafael.getConteudosInscritos());
        System.out.println("Conteudos Concluídos por " + devRafael.getNome()+ " são " + devRafael.getConteudosConcluidos());
        System.out.println("XP: " + devRafael.calcularTotalXP());


        System.out.println("--------------------");


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos por " + devCamila.getNome()+ " são " + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos por " + devCamila.getNome()+ " são " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluídos por " + devCamila.getNome()+ " são " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXP());

    }
}
