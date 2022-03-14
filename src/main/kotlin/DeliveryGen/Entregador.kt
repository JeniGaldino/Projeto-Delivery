package DeliveryGen

class Entregador (nome:String ,telefone:String):Pessoa(nome,telefone) {
    var idade = 0
    var cpf = ""
    var endereco = ""

    constructor(nome: String, telefone: String, idade: Int, cpf: String, endereco :String) : this(nome, telefone) {
        this.nome = nome
        this.telefone = telefone
        this.idade = idade
        this.cpf = cpf
        this.endereco = endereco

    }

    override fun fazContato() {
        super.fazContato()
    }

    override fun feedback() {
        super.feedback()
    }


     fun cadastroEntregador(valor1: String, valor2 :String , valor3: String, valor4: String, valor5 :Int) {

         nome = valor1
         telefone = valor2
         endereco = valor3
         cpf = valor4
         idade = valor5

         println("\nCadastro efetuado com sucesso!\uD83C\uDFE9" +
                 "\nNome: $nome" +
                 "\nTelefone: $telefone" +
                  "\nEndereço: $endereco" +
                    "\ncpf: $cpf" +
                     "\nidade: $idade\n")
    }


}
