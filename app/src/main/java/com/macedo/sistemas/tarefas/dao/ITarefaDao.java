package com.macedo.sistemas.tarefas.dao;

import com.macedo.sistemas.tarefas.model.Tarefa;

import java.util.List;

public interface ITarefaDao {


    public boolean salvar(Tarefa tarefa);
    public boolean atualizar(Tarefa tarefa);
    public boolean deletar (Tarefa tarefa);
    public List<Tarefa> listar();

}
