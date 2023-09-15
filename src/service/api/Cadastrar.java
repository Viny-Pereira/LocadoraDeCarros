package src.service.api;

import src.repository.ClienteRepository;

public interface Cadastrar<T> {
    void execute(T entity);
}
