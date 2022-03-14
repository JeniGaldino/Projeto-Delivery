package DeliveryGen

 open class Pessoa(var nome:String, var telefone: String ) {

    init {
        if (nome.isEmpty() || telefone.isEmpty()) {
            throw Exception ("O usuário precisa de nome e telefone!")
        }
    }


 open fun feedback (){
     println("Por favor, avalie nossos serviços dando uma nota de 0/5 estrelas \uD83C\uDF1F: ")
     val feedback = readLine()!!.toInt()
     if(feedback < 4){

         println("Você avaliou como $feedback \uD83C\uDF1F: " +
                 "Gostaríamos de saber, como podemos melhorar?")
         val feedbackcoment = readLine()!!
         if (feedbackcoment.isEmpty()) {
              println("Não há mensagem no espaço. ")
         } else {
             println("Mensagem enviada com sucesso!Obrigada pelo feedback!")
         }

     }else{
         println("Obrigada pelo feedback!")
     }
   }

   open fun fazContato () {
       println("Deseja enviar alguma mensagem ou recomendação" +
               "\n 1- Sim / 2- Não")
       val opc1 = readLine()!!.toInt()
       if (opc1 == 1) {
           println("Digite sua mensagem:")
           val desejaEnviarMsg = readLine()!!

           if (desejaEnviarMsg.isEmpty()) {
               println("Não há mensagem no espaço. ")
           } else {
               println("Mensagem enviada com sucesso!")
           }
       }
    }


}





