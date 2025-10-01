
create database dbb_recuperacao;
use dbb_recuperacao;
    
create table tb_usuario (
	id int not null auto_increment primary key,
    nome varchar(100),
    email varchar(50),
    senha varchar(15)
    );
    

create table tb_livros (
    id int not null auto_increment primary key,
    nomeLivro varchar(100),
    editora varchar(100),
    ano int,
    disponivel boolean default false,
    usuario_id int,
    foreign key (usuario_id) references tb_usuario(id)
);

