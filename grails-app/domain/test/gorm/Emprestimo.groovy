package test.gorm

import grails.rest.Resource

@Resource(uri='/emprestimos')
class Emprestimo {

    String tipo
    Leitor leitor

    static constraints = {
    }
    static mapping = {
        version false
    }

}
