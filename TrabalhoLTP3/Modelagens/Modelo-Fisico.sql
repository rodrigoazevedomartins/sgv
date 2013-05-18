CREATE DATABASE sgv;

CREATE TABLE pagamento (
codpagamento int(11) auto_increment PRIMARY KEY,
tipo varchar(255), 
status int(1)
);

CREATE TABLE pessoa (
codpessoa int(11) auto_increment PRIMARY KEY,
nome varchar(255),
nomemae varchar(255),
nomepai varchar(255),
rg varchar(255),
cpf varchar(255),
datanasc date,
naturalidade varchar(255), 
status int(1)
);

CREATE TABLE telefone (
codtelefone int(11) auto_increment PRIMARY KEY,
area int(2),
numero int(10),
codpessoa int(11),
FOREIGN KEY (codpessoa) REFERENCES pessoa (codpessoa),
status int(1)
);

CREATE TABLE email (
codemail int(11) auto_increment PRIMARY KEY,
endereco varchar(255),
codpessoa int(11),
FOREIGN KEY (codpessoa) REFERENCES pessoa (codpessoa),
status int(1)
);

CREATE TABLE endereco (
codendereco int(11) auto_increment PRIMARY KEY,
rua varchar(255),
numero int(11),
complemento varchar(255),
bairro varchar(255),
cidade varchar(255),
cep int(8),
estado varchar(255),
pais varchar(255),
codpessoa int(11),
FOREIGN KEY (codpessoa) REFERENCES pessoa (codpessoa),
status int(1)
);

CREATE TABLE usuario (
codusuario int(11) auto_increment PRIMARY KEY,
usuario varchar(255),
senha varchar(255),
codpessoa int(11),
FOREIGN KEY (codpessoa) REFERENCES pessoa (codpessoa),
status int(1)
);

CREATE TABLE cliente (
codcliente int(11) auto_increment PRIMARY KEY,
codpessoa int(11),
FOREIGN KEY (codpessoa) REFERENCES pessoa (codpessoa),
status int(1)
);

CREATE TABLE produto (
codproduto int(11) auto_increment PRIMARY KEY,
nome varchar(255),
descricao varchar(255),
valor_unitario_venda double,
valor_unitario_compra double,
estoque int(11), 
status int(1)
);

CREATE TABLE venda (
codvenda int(11) auto_increment PRIMARY KEY,
datavenda datetime,
codpagamento int(11),
codcliente int(11),
codusuario int(11),
FOREIGN KEY (codpagamento) REFERENCES pagamento (codpagamento),
FOREIGN KEY (codcliente) REFERENCES cliente (codcliente),
FOREIGN KEY (codusuario) REFERENCES usuario (codusuario),
status int(1)
);

CREATE TABLE vendaproduto (
codvendaproduto int(11) auto_increment PRIMARY KEY,
codvenda int(11),
codproduto int(11),
quantidade int(11),
FOREIGN KEY (codvenda) REFERENCES venda (codvenda),
FOREIGN KEY (codproduto) REFERENCES produto (codproduto),
status int(1)
)