package src.service.api;

public interface Buscar<T> {
    T execute(String identificacao);
}
