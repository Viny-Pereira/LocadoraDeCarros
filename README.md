# ADA LocateCar - Locadora de veículos

## Objetivo

Projeto desenvolvido como parte da formação de Java fornecido pela ADA em parceria com o SANTANDER. Nesse projeto
desenvolvi uma Locadora de veiculos em Java, aplicadando os conceitos de SOLID. Nessa aplicação foram implementadas as
funções:

- Cadastrar os veículos;
- Alterar um veículo cadastrado;
- Buscar um veículo por Placa;
- Cadastrar o cliente (pessoa física e jurídica)
- Alterar o cliente (pessoa física e jurídica)
- Alugar um veículo para pessoa física e jurídica;
- Devolver um veículo para pessoa física e jurídica;

Sendo que essas funções buscaram atender as seguintes regras de negócio:

- RN1: Cada placa só pode ser cadastrada 1 vez, sendo esse a variável que diferencia os veiculos;
- RN2: Serão considerados 3 tipos de veiculo:
    - PEQUENO
    - MEDIO
    - SUV;
- RN3: Os aluguéis e devoluções terão o local, data e horário;
- RN4: Considere aluguel em horas quebradas como uma diária completa.
- RN5: Os veículos que estiverem alugados não poderão estar disponíveis;
- RN6: Cada CPF/CNPJ só pode ser cadastrada 1 vez, sendo esse a variável que diferencia os clientes.
- RN7: Regras de devolução:
  Caso o cliente pessoa física tenha ficado com o carro mais que 5 diárias terá direito a 5% de desconto.
  Caso o cliente pessoa jurídica tenha ficado com o carro mais que 3 diárias terá direito a 10% de desconto.
  Valores base da diária por tipo de veículo:
    - Tipo de Veículo Valor por dia
    - PEQUENO R$ 100,00
    - MEDIO R$ 150,00
    - SUV R$ 200,00

## Organização

### Pastas

- As pastas de trabalho foram divididas em 5 subdiretórios:
    - repository: Sendo responsável pela gravação dos dados;
    - service: Responsável pela criação de funções que implementam a regra de negócio, tem acesso ao repository, fazendo
      as chamadas necessárias;
    - model: os objetos que serão trabalhados, contendo os atributos e getters e setters;
    - controller: interface com usuário e algumas verificações;
    - utils: funções não relacionados diretamente a regra de negócio.

### Utilização

- Main: arquivo principal que chama os controller.
  São compostos de 7 funções.

1. Cadastrar os veículos;

- Nessa opção você deve cadastrar um veiculo, sendo necessário informar:
    - Placa
    - Tipo de Veiculo

2. Alterar um veículo cadastrado:
    - Nessa opção você pode alterar a placa de um veiculo cadastrado, sendo necessário para isso informar a placa do
      veiculo antiga e a nova.

3. Buscar um veículo por placa:
    - Nessa opção você pode ver as informações do veiculo cadastrado, sendo necessário para isso informar a placa do
      veiculo.

4. Cadastrar o cliente (pessoa física e jurídica):

- Nessa opção você deve cadastrar um cliente, sendo necessário informar o:
    - Nome;
    - Tipo de cliente:
        - Pessoa Física;
            - CPF;
            - IDADE.
        - Pessoa Jurídica.
            - CPNJ;

5. Alterar o cliente (pessoa física e jurídica):
    - Nessa opção você pode alterar o nome de um cliente cadastrado, sendo necessário para isso informar o identificador
      do cliente, e o novo nome.
6. Alugar um veículo para pessoa física e jurídica:
    - Nessa opção você executa o aluguel de um veiculo, sendo necessário:
        - Fornecer um identificador do cliente (CPF/CNPJ);
        - Placa do veiculo;
        - Informar a data de aluguel no formato: dd-MM-yyyy HH:mm:ss.
          Nessa etapa criamos um contrato de locação que guarda as informações do cliente, veiculo e data de aluguel,
          além de modificar o estádo do veiculo para indisponiel.
7. Devolver um veículo para pessoa física e jurídica:
    - Nessa opção você pode devolver o veiculo, sendo o processo:
        - Informar a placa do veiculo que deseja devolver;
        - Digitar a data de devolução no formato: dd-MM-yyyy HH:mm:ss;
    - Tendo como resultado o valor a ser pago pelo tempo de locação
      Sendo que ao final do processo o veiculo e contrato são atualizados, tornando o veiculo como disponível.

## Atualizações futuras

- Implementação de interface;
- Gravar os dados em arquivos;

