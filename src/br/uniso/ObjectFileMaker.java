package br.uniso;

import javax.imageio.IIOException;
import java.io.*;

public class ObjectFileMaker {
    public static void main(String args[]) {

        File file = new File("arquivoObjetos.bin");
        try{
            file.createNewFile();
            Student s1 = new Student();
            s1.setCurso("JG");
            s1.setNome("Minitti");
            s1.setIdade(18);


            Student s2 = new Student();
            s2.setCurso("ADC");
            s2.setNome("Lucas");
            s2.setIdade(20);

            Student s3 = new Student();
            s3.setCurso("SUP");
            s3.setNome("Pedro");
            s3.setIdade(20);

            Student s4 = new Student();
            s4.setCurso("MID");
            s4.setNome("Dota");
            s4.setIdade(20);

            Student s5 = new Student();
            s5.setCurso("TOP");
            s5.setNome("Enzo");
            s5.setIdade(19);

            //fluxo de saida --> OutputStream
            // quando vai da memoria pro HD

            OutputStream os = new FileOutputStream(file);
            //fluxo de saida especial pra gravar objetos woooow
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.writeObject(s3);
            oos.writeObject(s4);
            oos.writeObject(s5);
            oos.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }








}
