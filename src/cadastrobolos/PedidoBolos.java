
package cadastrobolos;

import java.util.ArrayList;
import java.util.List;


public class PedidoBolos {
    List<Bolo> listaDeBolos=new ArrayList<>();
    
    public void adicionarBolo(Bolo bolo){
        listaDeBolos.add(bolo);
    }
    
    public Bolo buscarBolo(String nomeDoBolo){
        for(Bolo b:listaDeBolos){
            if(b.getNome().equals(nomeDoBolo)){
                return b;
            }
        }
        return null;
    }
    
    public Bolo buscarBolo(Bolo bolo){  //polimorfismo
        for(Bolo b:listaDeBolos){
            if(b==bolo){    //comparando ponteiro de memória
                return b;
            }
        }
        return null;
    }
    
    public boolean removerBolo(String nomeDoBolo){
        Bolo b= buscarBolo(nomeDoBolo);
           if(b!=null){
               listaDeBolos.remove(b);
               return true;
           }
        return false;
    }
    
    public boolean removerBolo(Bolo bolo){
        Bolo b= buscarBolo(bolo);
           if(b!=null){
               listaDeBolos.remove(b);
               return true;
           }
        return false;
    }
    
    public boolean atualizarBolo(Bolo bolo){
        Bolo b=buscarBolo(bolo);
        
        if(b!=null){
            b.setNome(bolo.getNome());
            b.setPeso(bolo.getPeso());
            b.setTamanho(bolo.getTamanho());
            b.setPreco(bolo.getPreco());
            return true;
        }
        return false;
    }
    
    public String gerarRelatorio(){
        String relatorio="";
        System.out.println("Relatório de Bolos");
        for(Bolo b:listaDeBolos){
            relatorio+="Nome:"+b.getNome()+"\n";
            relatorio+="Tamanho:"+b.getTamanho()+"\n";
            relatorio+="Peso:"+b.getPeso()+"\n";
            relatorio+="Preço:"+b.getPreco()+"\n";
            relatorio+="============\n";
        }
        if(relatorio==""){
            return null;
        }
        return relatorio;  
    }
    
}
