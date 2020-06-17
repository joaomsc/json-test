package test.gorm

import grails.converters.JSON

class EmprestimoController {

    def index() {
        //JSON.use('deep') {
            render Emprestimo.list() as JSON
        //}
    }
}
