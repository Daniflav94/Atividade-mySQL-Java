CREATE DATABASE biblioteca;
USE biblioteca;

-- Comando DROP para apagar as tabelas

DROP TABLE cliente;
DROP TABLE endereco;
DROP TABLE livro;
DROP TABLE emprestimoLivro;

-- Tabelas (create)

CREATE TABLE cliente(
	idCliente INTEGER PRIMARY KEY AUTO_INCREMENT,
	nomeCompleto VARCHAR(50) NOT NULL,
	cpf VARCHAR(15) NOT NULL,
	telefone INTEGER NOT NULL
);

CREATE TABLE endereco(
	idEndereco INTEGER PRIMARY KEY AUTO_INCREMENT,
    rua VARCHAR(50) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    cep INTEGER NOT NULL,
    cidade VARCHAR(30),
    uf VARCHAR(2),
    idCliente INTEGER UNIQUE NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES cliente(idCliente)
);

CREATE TABLE livro(
	idLivro INTEGER PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(50) NOT NULL,
    autor VARCHAR(40) NOT NULL,
    qntExemplares INTEGER DEFAULT(1)
);

CREATE TABLE emprestimolivro(
	idEmprestimoLivro INTEGER PRIMARY KEY AUTO_INCREMENT,
    idCliente INTEGER NOT NULL,
    dataEmprestimo DATE NOT NULL,
    dataDevolucao DATE NOT NULL,
    idLivro INTEGER NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES cliente(idCliente),
    FOREIGN KEY (idLivro) REFERENCES livro(idLivro)
);

-- Inserção dos dados (insert)

INSERT INTO cliente(nomeCompleto, cpf, telefone) VALUES("Daniele Almeida", "44444444444", 945567816);
INSERT INTO cliente(nomeCompleto, cpf, telefone)  VALUES("Felipe Almeida", "22211112345", 945567817);
INSERT INTO cliente(nomeCompleto, cpf, telefone)  VALUES("Bob Almeida", "33311112345", 925567818);
INSERT INTO cliente(nomeCompleto, cpf, telefone)  VALUES("Daenerys Targaryen", "42411112345", 985567817);

INSERT INTO endereco(rua, numero, cep, cidade, uf, idCliente) VALUES("Rua Augusto Calheiro", "123", 09380123, "Mauá", "SP", 1);
INSERT INTO endereco(rua, numero, cep, cidade, uf, idCliente)  VALUES("Rua Augusto Calheiro", "123", 09380123, "Mauá", "SP", 2);
INSERT INTO endereco(rua, numero, cep, cidade, uf, idCliente)  VALUES("Rua Augusto Calheiro", "123", 09380123, "Mauá", "SP", 3);
INSERT INTO endereco(rua, numero, cep, cidade, uf, idCliente)  VALUES("Rua Dragon Stone", "444", 09380145, "GOT", "SP", 4);

INSERT INTO livro(titulo, autor, qntExemplares) VALUES("Orgulho e Preconceito", "Jane Austen", 2);
INSERT INTO livro(titulo, autor, qntExemplares) VALUES("Frankstein", "Mary Shelley", 1);
INSERT INTO livro(titulo, autor, qntExemplares) VALUES("A Seleção", "Kiera Cass", 3);
INSERT INTO livro(titulo, autor, qntExemplares) VALUES("A Guerra dos Tronos - Crônicas de Gelo e Fogo", "George R.R Martin", 1);
INSERT INTO livro(titulo, autor, qntExemplares) VALUES("A Fúria dos Reis - Crônicas de Gelo e Fogo", "George R.R Martin", 2);
INSERT INTO livro(titulo, autor, qntExemplares) VALUES("Duna", "Frank Herbert", 1);

INSERT INTO emprestimoLivro(idCliente, dataEmprestimo, dataDevolucao, idLivro) VALUES(1, current_date(), "2022-11-02", 3);
INSERT INTO emprestimoLivro(idCliente, dataEmprestimo, dataDevolucao, idLivro) VALUES(1, current_date(), "2022-11-02", 1);
INSERT INTO emprestimoLivro(idCliente, dataEmprestimo, dataDevolucao, idLivro) VALUES(2, current_date(), "2022-11-02", 2);
INSERT INTO emprestimoLivro(idCliente, dataEmprestimo, dataDevolucao, idLivro) VALUES(2, current_date(), "2022-11-02", 6);
INSERT INTO emprestimoLivro(idCliente, dataEmprestimo, dataDevolucao, idLivro) VALUES(3, current_date(), "2022-11-02", 4);
INSERT INTO emprestimoLivro(idCliente, dataEmprestimo, dataDevolucao, idLivro) VALUES(4, current_date(), "2022-11-02", 5);
INSERT INTO emprestimoLivro(idCliente, dataEmprestimo, dataDevolucao, idLivro) VALUES(4, "2022-10-10", "2022-10-15", 1);
INSERT INTO emprestimoLivro(idCliente, dataEmprestimo, dataDevolucao, idLivro) VALUES(1, "2022-10-01", "2022-10-05", 5);

-- Exibir as tabelas com os dados (select)

SELECT * FROM cliente;
SELECT * FROM endereco;
SELECT * FROM livro;
SELECT * FROM emprestimolivro;

-- Exibição dos dados utilizando inner join

SELECT cliente.nomeCompleto AS nomeCliente, livro.titulo AS livrosAlugados, dataEmprestimo, dataDevolucao FROM emprestimolivro
	INNER JOIN cliente
    ON emprestimolivro.idCliente = cliente.idCliente
    INNER JOIN livro
    ON emprestimoLivro.idLivro = livro.idLivro;
    
SELECT cliente.nomeCompleto, endereco.rua, endereco.numero, endereco.cep, endereco.cidade, endereco.uf FROM cliente
	INNER JOIN endereco
    ON cliente.idCliente = endereco.idCliente;
    
-- Filtros (com where)

SELECT * FROM livro WHERE qntExemplares > 1;

SELECT cliente.nomeCompleto, livro.titulo, emprestimolivro.dataEmprestimo, emprestimolivro.dataDevolucao FROM emprestimolivro 
INNER JOIN cliente
ON emprestimolivro.idCliente = cliente.idCliente
INNER JOIN livro
ON emprestimolivro.idLivro = livro.idLivro
WHERE dataDevolucao < current_date();

-- Atualizar dados 

UPDATE emprestimolivro
SET dataEmprestimo = "2022-10-27"
WHERE idEmprestimoLivro = 6;

-- Deletar dados

DELETE FROM livro
WHERE idLivro = 6;

 



