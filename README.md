# Decola Tech
Java RESTful API criada para decola-tech Avanade.

## Diagrama de Classes

```mermaid
classDiagram
    class Usuario {
        +List<Tarefa> altaPrioridade
        +List<Tarefa> mediaPrioridade
        +List<Tarefa> baixaPrioridade
    }

    class Tarefa {
        +String titulo
        +String descricao
        +String categoria
        +boolean concluida
        +String prioridade
    }

    Usuario "1" *-- "N" Tarefa
