package aplicacaodo;

import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
       
        
    Scanner sc = new Scanner(System.in);
    
    //Nome da agenda será recebido no sc.nextLine
    System.out.println("Entre com o nome da agenda");
    String nome = sc.nextLine();
    
    //Foi passado diretamehte para o construtor o parâmetro nome 
    Agenda agenda = new Agenda(nome);
    //agenda.setNome("Agenda telefônica");
    
    //Foi criado a coleção de objetos contatos que irá percorrer as informações no for do objeto c
    // que irá setar o valor de cada array
    Contato[] contatos = new Contato[3];
    
        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com as informações do contato " + (i+1));
            //criei um objeto c direto da classe para setar os valores 
            Contato c = new Contato();
            
            
            System.out.println("Entre com o nome: ");
            nome = sc.nextLine();
            c.setNome(nome);
            
            System.out.println("Entre com o telefone: ");
            String telefone = sc.nextLine();
            c.setTelefone(telefone);
            
            System.out.println("Entre com o email: ");
            String email = sc.nextLine();
            c.setEmail(email);
            
            
            //Adicionei o objeto criado na posição específica do Array
            contatos[i] = c;
            
        }
    
        //Setei a coleção de objetos no método set
        //Se eu não passar essa coleção de objetos no método
        //Não terá absolutamente nada na classe contatos 
        agenda.setContatos(contatos);
        
        
        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }
    }
    
    
}
