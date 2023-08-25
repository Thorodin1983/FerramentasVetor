/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_revisao_ed;

/**
 *
 * @author luan.vviana
 */
public class TesteContato {
    
    public static void main(String[] args) throws Exception{
        VetorObjeto vetor = new VetorObjeto(5);
        
        Contato c1 = new Contato("Luan", "948402941", "luan.vasconcelos30@gmail.com");
        Contato c2 = new Contato("Luan", "948402941", "luan.vasconcelos30@gmail.com");
        Contato c3 = new Contato("Luan", "948402941", "luan.vasconcelos30@gmail.com");
        Contato c4 = new Contato("Luan", "948402941", "luan.vasconcelos30@gmail.com");
        Contato c5 = new Contato("Luan", "948402941", "luan.vasconcelos30@gmail.com");
    
    try{
        
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
        vetor.adiciona(c4);
        vetor.adiciona(c5);
        
    } catch(Exception e){
        e.printStackTrace();
    }
    
        System.out.println("Tamanho do vetor:"+ vetor.tamanho());
        System.out.println(vetor);
    }
    
}
