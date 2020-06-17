package test.gorm

import grails.rest.*

@Resource(uri='/leitores')
class Leitor {
    String nome
    String cpf

    static constraints = {
    }
    static mapping = {
        version false
    }


}
