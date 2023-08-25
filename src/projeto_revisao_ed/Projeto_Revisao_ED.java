package projeto_revisao_ed;

import java.util.List;

public class Projeto_Revisao_ED {

    public static void main(String[] args) throws Exception {
         Vetor vetor = new Vetor(10);

         try {
             vetor.adiciona("elemento 1");
             vetor.adiciona("elemento 2");
             vetor.adiciona("elemento 3");
             vetor.adiciona("elemento 4");
             vetor.adiciona("elemento 5");
             vetor.adiciona("elemento 6");
             vetor.adiciona("elemento 7");
             vetor.adiciona("elemento 8");
             vetor.adiciona("elemento 9");
             vetor.adiciona("elemento 10");
             vetor.adiciona("elemento 11");
             
         } catch (Exception e){
             e.printStackTrace();
         }
         
         System.out.println("Tamanho do vetor: "+vetor.tamanho());
         
         System.out.println(vetor.toString());
        
         vetor.remove(1);
         
         System.out.println(vetor.busca(1));
         
         System.out.println(vetor.busca1("elemento 2"));
         
         System.out.println(vetor.toString());
         
         System.out.println();
    }
    
}

