# nlw-spring
to do list em spring boot
Projeto de inicio em spring boot, irei colocar aqui as informações de passo a passo para fazer o porjeto
da forma que eu entendi para que eu possa refazer sempre.

1. foi criado o projeto no spring initializr com dependencias de spring web
2. foi criado o model e o controller
3. o model recebe as informações do que compoe o objeto
4. o controller recebe as informações de negocio, todas as ações que deverão ser realizadas.
5. @requestmapping é a definição do caminho do url
6. @restcontroller é o tipo de requisição.
7. inserindo lombok no model (@data) faz desnecessario o uso de escrever os getters e setters, é uma mae
8. configurar o banco de acordo com o utilizado, verificar na web modelos prontos
9. configurar os dados do model para o envio do banco de dados
10. @entity é para botar o nome da tabela
11. @id é para id
12. uuid é um modelo de chave primaria muito segura para id
13. @generatedValue é para gerar os valores automaticamente
14. depois criar uma interface do usuarios para utilizar os metodos do jpa
15. sempre com "I" na frente da interface seguido do nome pra facilitar
16. extends a interface do JpaRepository passando de parametro em quem sera utilizado
17. agora é possivel importar no controller para usar os metodos, senpre chamando com nome da clase e depois da função
18. @autowired é para gerir automaticamente a interface
