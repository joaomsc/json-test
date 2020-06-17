package test.gorm

class BootStrap {

    def init = { servletContext ->
        def leitor = new Leitor(nome: "joao", cpf:"000.000.000-00").save()
        new Emprestimo(tipo: "rapido", leitor: leitor.getId()).save()

        Emprestimo.withTransaction {
            it -> it.flush()
        }
    }
    def destroy = {
    }
}
