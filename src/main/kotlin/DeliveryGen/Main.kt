import DeliveryGen.Cliente
import DeliveryGen.Empreendedor
import DeliveryGen.Entregador
fun main() {

    val cadEmpreendedor = Empreendedor(" ", " ")
    val cadCliente = Cliente(" ", " ", " ", " ", " ")
    val cadEntregador = Entregador(" ", " ", 0, " ", " ")

    println("* * * * * DELIVERY GEN * * * * *")
    println(
        "Cadastro de usuário" +
                "\nQual seu tipo de cadastro?" +
                "\n1-Empreendedor    2-Entregador     3-Cliente"
    )

    val tipo = readLine()!!.toInt()

    do {
        when (tipo) {

            //Empreendedor
            1 -> {

                println("CADASTRO DA EMPRESA")
                print("Escreva seu nome:")
                val nome = readLine()!!
                print("Escreva seu telefone:")
                val telefone = readLine()!!
                print("Escreva seu cnpj:")
                val cnpj = readLine()!!

                cadEmpreendedor.cadastroEmp(nome, telefone, cnpj)
            }

            //Entregador
            2 -> {
                println("CADASTRO DO ENTREGADOR")
                print("Escreva seu nome:")
                val nome = readLine()!!
                print("Escreva seu telefone:")
                val telefone = readLine()!!
                print("Escreva seu endereço:")
                val endereco = readLine()!!
                print("Escreva seu CPF:")
                val cpf = readLine()!!
                print("Escreva sua idade:")
                val idade = readLine()!!.toInt()

                cadEntregador.cadastroEntregador(nome, telefone, endereco, cpf, idade)
            }

            //Cliente
            3 -> {
                println("CADASTRO DO CLIENTE")
                print("Escreva seu nome:")
                val nome = readLine()!!
                print("Escreva seu telefone:")
                val telefone = readLine()!!
                print("Escreva seu email:")
                val email = readLine()!!
                print("Escreva seu endereço:")
                val endereco = readLine()!!
                print("Escreva seu senha:")
                val senha = readLine()!!

                cadCliente.cadastro(nome, telefone, email, endereco, senha)
            }

        }
        println(
            "Deseja terminar o Cadastro?\n" +
                    " 1-Sim/2-Não"
        )
        val continua = readLine()!!.toInt()
    } while (continua != 1)


    print(
        "\nDeseja fazer um pedido?" +
                "\n1-Sim/2-Não\n"
    )
    val pedido: Int = readLine()!!.toInt()

    if (pedido == 1) {
        do {
            println("\n* * * MENU  * * *")
            println("1- Adicionar pizza salgada")
            println("2- Adicionar pizza doce")
            println("3- Remover produto do pedido")
            println("4- Listar os produtos do pedido")
            println("5- Finalizar pedido\n")

            print("Digite a função desejada")
            val opc: Int = readLine()!!.toInt()

             when (opc) {

                1 -> {cadCliente.fazPedidoSalgado()
                }
                2 -> {cadCliente.fazPedidoDoce()
                }
                3 -> {cadCliente.removeitem()
                }
                4 -> {cadCliente.listar()
                }
                5-> {
                    println("Pedido finalizado com sucesso!")

                }


            }  } while (opc != 5)

        cadCliente.fazContato()
        cadCliente.feedback()

    }



        }



