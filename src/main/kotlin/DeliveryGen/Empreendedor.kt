package DeliveryGen

  class Empreendedor(nome: String, telefone: String) : Pessoa(nome, telefone) {

      var cnpj = ""

      constructor(nome: String, telefone: String, cnpj: String) : this(nome, telefone) {
          this.nome = nome
          this.telefone = telefone
          this.cnpj = cnpj

      }


      override fun feedback() {
          super.feedback()
      }

      override fun fazContato() {
          super.fazContato()
      }


          fun cadastroEmp(valor1: String, telefone: String, cnpj: String) {
              nome = valor1
              println(
                  "\nCadastro efetuado com sucesso!\ud83c\udfe9 " +
                          "\nNome: $nome" +
                          "\nTelefone: $telefone:" +
                          "\nCNPJ: $cnpj" +
                          "\n"
              )

          }
      }






























