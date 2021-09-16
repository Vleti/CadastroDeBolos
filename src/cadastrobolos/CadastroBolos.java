
package cadastrobolos;

public class CadastroBolos {

    
    public static void main(String[] args) {
        
        Bolo bolo1=new Bolo();
        bolo1.setNome("Floresta Negra");
        bolo1.setTamanho("20 cm");
        bolo1.setPeso(2000);
        bolo1.setPreco(51.5);
        
        Bolo bolo2=new Bolo();
        bolo2.setNome("Abacaxi");
        bolo2.setTamanho("20 cm");
        bolo2.setPeso(3000);
        bolo2.setPreco(45.2);
        
        PedidoBolos cadBolos=new PedidoBolos();
        cadBolos.adicionarBolo(bolo1);
        cadBolos.adicionarBolo(bolo2);
        
        //relatorio Bolos
        System.out.println(cadBolos.gerarRelatorio());
        
        //busca
        Bolo boloBusca=cadBolos.buscarBolo("Abacaxi");
        if (boloBusca!=null) {
          System.out.println("Preço do bolo:"+boloBusca.getPreco()+"\n");  
        }
        else{
            System.out.println("Bolo não encontrado\n");
        }
        
        //remoção
        
        if(cadBolos.removerBolo("Floresta Negra")){
            System.out.println("Bolo removido com sucesso!\n");
        }
        else{
            System.out.println("Problema ao remover bolo!\n");
        }
       
        System.out.println(cadBolos.gerarRelatorio());
        
        //update
        Bolo boloBuscaUpdate=cadBolos.buscarBolo("Abacaxi");
        boloBuscaUpdate.setNome("Abacaxi Xiacaba");//já faz atualização pro ponteiro
        boloBuscaUpdate.setPreco(23.4);
        
        cadBolos.atualizarBolo(boloBuscaUpdate);
        
        System.out.println(cadBolos.gerarRelatorio());
        
        
        //remoção pelo objeto
        Bolo boloRemove=cadBolos.buscarBolo("Abacaxi Xiacaba");
        
        if(cadBolos.removerBolo(boloRemove)){
            System.out.println("Bolo removido com sucesso!\n");   
        }
        else{
            System.out.println("Problema ao remover o bolo!\n");
        }
        
        if(cadBolos.gerarRelatorio()==null){
            System.out.println("Não há mais bolos registrados");
        }
        
    }
    
}
