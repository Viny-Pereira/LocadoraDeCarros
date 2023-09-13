package src.service.api;

import src.repository.ClienteRepository;

public interface Cadastrar<T> {
    boolean execute(T entity);
}
