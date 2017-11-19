
import java.io.*;	
import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
public class ClasseMetodos {
 public Aluno GravaAluno (Aluno aluno) throws IOException {	
    int i;
    String row_record;
    String fileName = "ArquivoAluno2.txt";
    aluno = new Aluno();
    aluno.pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");	
    aluno.unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");	
    aluno.pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos Graduação do aluno:"));
    row_record = String.format("%s|%s|%s\n", aluno.pnome, aluno.unome, aluno.pontos);
    Path path = Paths.get(fileName);
    if (Files.exists(path)) {
        Files.write(path, row_record.getBytes(), StandardOpenOption.APPEND);
    }
    else {
        File f = new File(fileName);
        f.createNewFile();
        Files.write(path, row_record.getBytes(), StandardOpenOption.APPEND);
    }
    System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");	
//    writer.close();
  return aluno;
}	


	
 public void LerAluno ( Aluno[ ] aluno ) throws IOException{
    int i;
    String fileName = "ArquivoAluno.txt";	
    BufferedReader ler = new BufferedReader(new FileReader( fileName ));	
    for (i = 0 ; i < 3 ; i++)	
        aluno[i] = new Aluno();
        for (i = 0 ; i < 3 ; i++)   {	
            aluno[i].pnome = ler.readLine();
            aluno[i].unome = ler.readLine();
            aluno[i].pontos = Integer.parseInt(ler.readLine());	
        }
  	
  for (i = 0 ; i < 3; i++) {	
   System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);	
  }
  ler.close();	
  }	
}	
