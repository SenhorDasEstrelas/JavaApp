package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaApplication1 {

    public static void main(String[] args) {
      Aluno a1 = new Aluno("Josué",31);
      Aluno a2 = new Aluno("Fernanda",40);
      Aluno a3 = new Aluno("Juliana",17);
      
      //CRIAÇÃO DA LISTA:
      
        List<Aluno> listaAluno = new ArrayList<>();
//        listaAluno.add(a1);
//        listaAluno.add(a2);
//        listaAluno.add(a3);

          listaAluno.addAll(Arrays.asList(a1, a2, a3));
         
        
        for (Aluno listaAluno1 : listaAluno) {
            System.out.println(listaAluno1.getNome()
                    + "\n" + listaAluno1.getIdade());
            
        }
          Set<Aluno> listaAlunoSet = new HashSet<>();
          listaAlunoSet.add(a1);
          listaAlunoSet.add(a2);
          listaAlunoSet.add(a3);
          
          for (Aluno listaAlunoSet1 : listaAlunoSet) {
              System.out.println(listaAlunoSet1.getNome());
          }
    }
    
}
