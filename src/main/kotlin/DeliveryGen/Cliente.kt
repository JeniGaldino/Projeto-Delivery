package DeliveryGen

    class Cliente( nome: String, telefone: String, var email: String, var senha: String, var endereco: String):
          Pessoa(" "," ") {

        var listaDeCompras = mutableListOf<String>()
        var listaDeAdicionais = mutableListOf<String>()

        override fun feedback() {
            super.feedback()
        }

        override fun fazContato() {
            super.fazContato()
        }

         fun cadastro(valor1 : String, valor2: String,valor3 : String,valor4 : String,valor5 : String ) {
            nome = valor1
            telefone = valor2
            email= valor3
            endereco = valor4
            senha = valor5

            println("\nCadastro efetuado com sucesso!\uD83C\uDFE9" +
                    "\nNome: $nome" +
                    "\nTelefone: $telefone" +
                    "\nEmail: $email" +
                    "\nEndereço: $endereco" +
                    "\nSenha: $senha\n")
        }



        fun fazPedidoSalgado() {
            println("\n* * *CARDÁPIO PIZZA SALGADA * * *")
                          println(
                    "Por favor, escolha entre nossas opções no cardápio: " +
                            "\n1 - Calabresa\n" +
                            "2 - Portuguesa\n" +
                            "3 - Marguerita\n" +
                            "4 - Frango com catupiry\n" +
                            "5 - Muçarela\n" +
                            "6 - Quatro queijos\n")

                var opc2 = readLine()!!.toInt()

                when (opc2) {
                    1 -> {println("Você escolheu a pizza de Calabresa")
                        listaDeCompras.add("Calabresa")
                    }
                    2 -> {println("Você escolheu a pizza de Portuguesa")
                        listaDeCompras.add("Portuguesa")
                    }
                    3 -> {println("Você escolheu a pizza de Marguerita")
                        listaDeCompras.add("Marguerita")
                    }
                    4 -> {println("Você escolheu a pizza de Frango com catupiry ")
                        listaDeCompras.add("Catupiry")
                    }
                    5 -> {println("Você escolheu a pizza de Muçarela")
                        listaDeCompras.add("Muçarela")
                    }
                    6 -> {println("Você escolheu a pizza de Quatro queijos")
                        listaDeCompras.add("Quatro Queijos")
                    }

                }


            println("Deseja incluir borda?" +
                    "\n 1- Sim / 2- Não")
            var opc1 = readLine()!!.toInt()
            if (opc1 == 1) {

                println(
                    "Escolha o sabor: " +
                            "\n1 - Catupiry" +
                            "\n2 - Cheddar\n"
                )
                var borda = readLine()!!.toInt()

                when (borda) {
                    1 -> {println("Ok, iremos adicionar catupiry na sua borda!")
                        listaDeAdicionais.add("Catupiry")
                    }

                    2 -> {println("Ok, iremos adicionar cheddar na sua borda")
                        listaDeAdicionais.add("Cheddar")
                    }
                }

                println("Por favor confira seu carrinho de compras:" +
                        "\nPizza: $listaDeCompras e de adicionais $listaDeAdicionais")
            } else {
                println("Ok!")
            }
        }


        fun fazPedidoDoce() {
            println("\n* * *CARDÁPIO PIZZA DOCE * * *")
            println(
                "Por favor, escolha entre nossas opções no cardápio: " +
                        "\n7 - Brigadeiro\n" +
                        "8 - Chocolate\n" +
                        "9 - Banana\n" +
                        "10 - Romeu e Julieta\n"
            )
            var opc2 = readLine()!!.toInt()

            when (opc2) {

                7 -> {println("Você escolheu a pizza de Brigadeiro")
                    listaDeCompras.add("Brigadeiro")
                }
                8 -> {println("Você escolheu a pizza de Chocolate")
                    listaDeCompras.add("Chocolate")
                }
                9 -> { println("Você escolheu a pizza de Banana")
                    listaDeCompras.add("Banana")
                }
                10 -> {println("Você escolheu a pizza de Romeu e Julieta")
                    listaDeCompras.add("Romeu e Julieta")
                }
            }


            println("Deseja incluir borda?" +
                    "\n 1- Sim / 2- Não")
            var opc1 = readLine()!!.toInt()
            if (opc1 == 1) {

                println(
                    "Escolha o sabor: " +
                            "\n3 - Chocolate\n" +
                            "4 - Doce de Leite\n"
                )
                var borda = readLine()!!.toInt()

                when (borda) {

                    3 -> {println("Ok, iremos adicionar chocolate na sua borda")
                        listaDeAdicionais.add("Chocolate")
                    }
                    4 -> {println("Ok, iremos adicionar doce de leite na sua borda")
                        listaDeAdicionais.add("Doce de Leite")
                    }
                }

                println("Por favor confira seu carrinho de compras:" +
                        "\nPizza: $listaDeCompras e de adicionais $listaDeAdicionais")
            } else {
                println("Ok!")
            }
        }


         fun listar () {
             println("\n* * * SEU CARRINHO * * *")
         println("Por favor confira seu carrinho de compras:" +
         "\nPizza: $listaDeCompras e de adicionais $listaDeAdicionais") }



        fun removeitem(){
            println("\n* * * REMOVER ITENS * * *")
            println("Veja os itens disponíveis na sua cesta:" +
                    "\nPizza: $listaDeCompras e de adicionais $listaDeAdicionais")

            println("Por favor digite o item que deseja remover (1 - Pizza ou 2 - Borda): ")
            var itemr = readLine()!!.toInt()
            if(itemr == 1){
                println("Por favor, digite o item a ser removido")
                var itemrr = readLine()!!
                listaDeCompras.remove(itemrr)
                println("Item $itemrr removido com sucesso!")
                println(listaDeCompras)
                println(listaDeAdicionais)
            } else {
                println("Por favor, digite o item a ser removido")
                var itemA= readLine()!!
                listaDeAdicionais.remove(itemA)

                println("Item $itemA removido com sucesso!")
                println(listaDeCompras)
                println(listaDeAdicionais)
            }
        }





    }






