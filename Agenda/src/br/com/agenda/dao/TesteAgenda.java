package br.com.agenda.dao;


import br.com.agenda.model.Contato;
import br.com.agenda.dao.ContatoDAO;
public class TesteAgenda {
 
public static void main(String args[]){
 
 ContatoDAO contatoDAO = new ContatoDAO();
 
 //Cria um contato e salva no banco
 Contato contato = new Contato();
 contato.setNome("Jose Maria da Silva");
 contato.setIdade(34);
 contato.setDataCadastro(new String("2014-12-12"));
 
 contatoDAO.save(contato);
 
 //Atualiza o contato com id = 2com os dados do objeto contato1
 Contato contato1 = new Contato();
 contato1.setId(2);
 contato1.setNome("NOME Alterado");
 contato1.setIdade(32);
 contato1.setDataCadastro(new String("2014-06-12"));
 
 contatoDAO.update(contato1);
 
 //Remove o contato com id = 1
 
 contatoDAO.removeById(1);
 
 //Lista todos os contatos do banco de dados
 
 for(Contato c : contatoDAO.getContatos()){
 
 System.out.println("NOME: " + c.getNome());
 }
 }
}