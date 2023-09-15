package src.repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira a data e hora no formato correto
        System.out.println("Por favor, insira a data e hora no formato dd-MM-yyyy HH:mm:ss");
        String dataAluguel = scanner.nextLine();

        // Crie um DateTimeFormatter para analisar a entrada
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        try {
            // Analise a entrada para obter um objeto LocalDateTime
            LocalDateTime dataAluguelFormatada = LocalDateTime.parse(dataAluguel, formatter);

            // Exiba a data e hora formatadas
            System.out.println("Data e hora formatadas: " + dataAluguelFormatada.format(formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data e hora inválido. Certifique-se de seguir o formato especificado.");
        }
    }
}