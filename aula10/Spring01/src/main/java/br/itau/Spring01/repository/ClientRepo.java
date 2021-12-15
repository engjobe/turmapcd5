package br.itau.spring01.repository;

import org.springframework.data.repository.CrudRepository;
import br.itau.spring01.model.Client;

// interface é "parecida" com uma clase abstrata, ou seja, é um modelo e não gera objetos.
// É usada para reduzir o forte acoplamento, que é gerado quando fazemos herança

// <Classe, ChavePrimária>
// CRUD = Create, Read, Update, Delete
public interface ClientRepo extends CrudRepository<Client, Long> {
    public Client findByEmail(String email);
}
