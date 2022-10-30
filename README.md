# Atividade JAVA & MYSQL - Modelagem de Banco de Dados e Modelagem Orientada a Objetos
 
 O objetivo dessa atividade era escolher uma temática e criar um diagrama de Entidade-Relacionamento, desenvolver as tabelas na linguagem SQL e desenvolver as classes no Java de cada entidade.

A temática que escolhi foi Biblioteca, as entidades do meu banco de dados são Cliente, Endereço e Livro.

No Java desenvolvi uma aplicação para a biblioteca que possui listagem de todos os clientes e livros cadastrados e também uma lista que contém todos os empréstimos realizados pela biblioteca (contendo relação entre cliente e livro). Também desenvolvi métodos para alugar livros, devolver livros, cadastrar clientes e cadastrar livros. Dentro dos métodos criei validações que verificam se o cliente ou o livro estão cadastrados antes de realizar o empréstimo do livro, ou se o livro está disponível. O método de alugar livro também realiza um cálculo de quando o livro deverá ser devolvido.

## Diagrama

![Diagrama banco de dados - Biblioteca](https://user-images.githubusercontent.com/99519903/198891635-011bae72-366b-4f61-81d3-9744c4135415.png)

## Resultado terminal da aplicação:

![Captura de tela 2022-10-30 140902](https://user-images.githubusercontent.com/99519903/198892120-462669c4-de12-4662-95aa-64759c6bc635.jpg)
![Captura de tela 2022-10-30 140939](https://user-images.githubusercontent.com/99519903/198892123-88a3f32e-d031-4e24-8d87-6a83fea6685d.jpg)


