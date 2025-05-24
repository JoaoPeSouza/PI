import javax.swing.JOptionPane;

public class Test2 {

    public static void main(String[] args) {
        int valor_inicial = 150;
        char Escolha_Inicial;
        String option_game_str;
        String nome1 = null;
        String nome2 = null;
        int[] respostas = new int[2];
        respostas[0] = valor_inicial;
        respostas[1] = valor_inicial;

        String menu = "Menu de start\n1 Executar \n2 Sair";
        String insert_nome1 = "Saudações, players!\nInsira o nome do primeiro jogador:";
        String insert_nome2 = "Saudações, players!\nInsira o nome do segundo jogador:";

        JOptionPane.showMessageDialog(null, "Bem-vindo ao Quizz de CONHECIMENTOS GERAIS do grupo JBL");
        String inputEscolha = JOptionPane.showInputDialog(menu);

        if (inputEscolha != null && !inputEscolha.isEmpty()) {
            Escolha_Inicial = inputEscolha.charAt(0);
          

            //          -------Case1: Escolha entre jogar o jogo ou não-----
            
            switch (Escolha_Inicial) {
                case '1':
                    
                    while(true) {
                        nome1 = JOptionPane.showInputDialog(null, insert_nome1);
                        if (nome1 == null || nome1.trim().isEmpty()) {JOptionPane.showMessageDialog(null, "Nome do primeiro jogador não informado.");
                    }
                    else{
                        break;   
                    }

                    }
                      while (true) {
                        nome2 = JOptionPane.showInputDialog(null, insert_nome2);
                        if(nome2 == null || nome2.trim().isEmpty()) {JOptionPane.showMessageDialog(null, "Nome do segundo jogador não informado.");
                    }
                    else{
                        break;
                    }
                        } 
                    
                                       
        
                
                    
                    //                                   --------------Início do Jogo---------------
                    
                    
                    JOptionPane.showMessageDialog(null, "Os jogadores começarão com: R$ " + valor_inicial + ",00");
                    option_game_str = JOptionPane.showInputDialog(null, "Podemos começar?\nDigite 1 para prosseguir\nDigite 2 para sair");

                    if (option_game_str != null && option_game_str.equals("2")) {
                        JOptionPane.showMessageDialog(null, "Ok. Obrigado por ter jogado!");
                    } else if (option_game_str != null && option_game_str.equals("1")) {
                        JOptionPane.showMessageDialog(null, "Certo. Começaremos o jogo!");

                        // PERGUNTAS
                        respostas[0] += fazerPergunta("\n**PERGUNTA PARA: " + nome1 + "\nQual é o maior país do mundo em termos de área?",
                                "A) Estados Unidos", "B) Rússia", "C) Canadá", "D) China", 'B', nome1);

                        respostas[1] += fazerPergunta("\n**PERGUNTA PARA: " + nome2 + "\nQuem foi o primeiro presidente do Brasil?",
                                "A) Getúlio Vargas", "B) Juscelino Kubitschek", "C) Marechal Deodoro da Fonseca", "D) Dom Pedro II", 'C', nome2);

                        respostas[0] += fazerPergunta("\n**PERGUNTA PARA: " + nome1 + "\nEm que ano a internet foi criada?",
                                "A) 1975", "B) 1983", "C) 1991", "D) 2000", 'B', nome1);

                        respostas[1] += fazerPergunta("\n**PERGUNTA PARA: " + nome2 + "\nQual é o nome do nosso sistema solar?",
                                "A) Via Láctea", "B) Andromeda", "C) Sistema Solar", "D) Galáxia Espiral", 'C', nome2);

                        respostas[0] += fazerPergunta("\n**PERGUNTA PARA: " + nome1 + "\nQuem escreveu a obra “Dom Quixote”?",
                                "A) William Shakespeare", "B) Gabriel García Márquez", "C) Miguel de Cervantes", "D) José Saramago", 'C', nome1);

                        respostas[1] += fazerPergunta("\n**PERGUNTA PARA: " + nome2 + "\nQual é o símbolo químico do ouro?",
                                "A) Au", "B) Ag", "C) Fe", "D) Hg", 'A', nome2);

                        respostas[0] += fazerPergunta("\n**PERGUNTA PARA: " + nome1 + "\nQuem pintou a obra “A Última Ceia”?",
                                "A) Michelangelo", "B) Rafael", "C) Leonardo da Vinci", "D) Van Gogh", 'C', nome1);

                        respostas[1] += fazerPergunta("\n**PERGUNTA PARA: " + nome2 + "\nQual é o maior oceano do mundo?",
                                "A) Atlântico", "B) Pacífico", "C) Índico", "D) Antártico", 'B', nome2);

                        respostas[0] += fazerPergunta("\n**PERGUNTA PARA: " + nome1 + "\nQual é o nome do continente que abriga o Egito?",
                                "A) Ásia", "B) Europa", "C) África", "D) América", 'C', nome1);

                        respostas[1] += fazerPergunta("\n**PERGUNTA PARA: " + nome2 + "\nQual é o planeta conhecido como “Planeta Vermelho”?",
                                "A) Vênus", "B) Júpiter", "C) Marte", "D) Saturno", 'C', nome2);

                        respostas[0] += fazerPergunta("\n**PERGUNTA PARA: " + nome1 + "\nEm que país nasceu o físico Albert Einstein?",
                                "A) Estados Unidos", "B) Alemanha", "C) Áustria", "D) Suíça", 'B', nome1);

                        respostas[1] += fazerPergunta("\n**PERGUNTA PARA: " + nome2 + "\nQual animal é conhecido como o “rei da selva”?",
                                "A) Elefante", "B) Leão", "C) Tigre", "D) Gorila", 'B', nome2);

                        respostas[0] += fazerPergunta("\n**PERGUNTA PARA: " + nome1 + "\nQual é o nome do rio mais extenso do mundo?",
                                "A) Rio Amazonas", "B) Rio Nilo", "C) Rio Mississipi", "D) Rio Yangtzé", 'A', nome1);

                        respostas[1] += fazerPergunta("\n**PERGUNTA PARA: " + nome2 + "\nEm que ano o homem pisou na Lua pela primeira vez?",
                                "A) 1965", "B) 1959", "C) 1972", "D) 1969", 'D', nome2);

                        respostas[0] += fazerPergunta("\n**PERGUNTA PARA: " + nome1 + "\nQuantos lados tem um hexágono?",
                                "A) 5", "B) 7", "C) 6", "D) 8", 'C', nome1);

                        respostas[1] += fazerPergunta("\n**PERGUNTA PARA: " + nome2 + "\nQuantos segundos há em 5 minutos?",
                                "A) 300", "B) 120", "C) 500", "D) 60", 'A', nome2);

                        respostas[0] += fazerPergunta("\n**PERGUNTA PARA: " + nome1 + "\nSe 1 lápis custa R$1,20 e você tem R$6,00, quantos lápis você pode comprar?",
                                "A) 6", "B) 5", "C) 4", "D) 3", 'B', nome1);

                        respostas[1] += fazerPergunta("\n**PERGUNTA PARA: " + nome2 + "\nSe todos os bloquinhos são verdes, e esse bloquinho é verde, então ele é:",
                                "A) Azul", "B) Diferente", "C) Igual aos outros", "D) Inútil", 'C', nome2);

                        respostas[0] += fazerPergunta("\n**PERGUNTA PARA: " + nome1 + "\nQual é o planeta mais próximo do Sol?",
                                "A) Vênus", "B) Terra", "C) Mercúrio", "D) Marte", 'C', nome1);

                        respostas[1] += fazerPergunta("\n**PERGUNTA PARA: " + nome2 + "\nQuem escreveu a famosa peça “Romeu e Julieta”?",
                                "A) William Shakespeare", "B) Machado de Assis", "C) José de Alencar", "D) Charles Dickens", 'A', nome2);

                        
                                // RESULTADO 
                        JOptionPane.showMessageDialog(null, "--- PLACAR ---" +
                                "\nDinheiro de " + nome1 + ": R$" + respostas[0] + ",00" +
                                "\nDinheiro de " + nome2 + ": R$" + respostas[1] + ",00");

                        if (respostas[0] > respostas[1]) {
                            JOptionPane.showMessageDialog(null, nome1 + " terminou com R$" + respostas[0] + ",00!");
                        } else if (respostas[1] > respostas[0]) {
                            JOptionPane.showMessageDialog(null, nome2 + " terminou com R$" + respostas[1] + ",00!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Empate! Ambos terminaram com R$" + respostas[0] + ",00.");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                    }

                    break;
                case '2':
                    JOptionPane.showMessageDialog(null, "Obrigado por ter jogado!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida no menu inicial.");
            }
        }
    }

    public static int fazerPergunta(String pergunta, String altA, String altB, String altC, String altD, char respostaCorreta, String nomeJogador) {
        final int PONTUACAO_POR_ACERTO = 50;

        String resposta = JOptionPane.showInputDialog(
                pergunta + "\n" + altA + "\n" + altB + "\n" + altC + "\n" + altD +
                "\n\nDigite a letra da alternativa correta:");

        if (resposta != null && !resposta.isEmpty()) {
            char respostaUsuario = Character.toUpperCase(resposta.charAt(0));
            if (respostaUsuario == respostaCorreta) {
                JOptionPane.showMessageDialog(null, "Parabéns, " + nomeJogador + "! Você acertou.\nEmbolsou R$" + PONTUACAO_POR_ACERTO + ",00");
                return PONTUACAO_POR_ACERTO;
            } else {
                JOptionPane.showMessageDialog(null, "Que pena, " + nomeJogador + ". Resposta incorreta. A resposta correta era: " + respostaCorreta);
                return 0;
            }
        } else {
            JOptionPane.showMessageDialog(null, nomeJogador + ", você não respondeu. Nenhum centavo embolsado.");
            return 0;
        }
    }
}







//                                                    -----------NOTAS AO TUTOR----------

/* 


Não consta outras telas adicionais pois o responsável pelas inplementações da mesma utilizou IA para inseri-las dentro do projeto, o que acarretou no
mal funcionamento do mesmo.

Um dos integrantes fez amplo uso de Inteligência artifical para desenvolver a sua parte no código, deixando-o extremamente bagunçado e de difícil entendimento.
Contudo, tentei salvar a parte dele (implementação das questões) fazendo o possível para que o código funcionasse utilizando O QUE FOI PASSADO EM SALA DE AULA 
e com o que nós aprendemos nas aulas de lógica de programação durante o semestre.


Contudo, peço-lhe perdão pela qualidade do trabalho. O mesmo deveria ter sido entregue com a maior qualidade possível; Com a maior dedicação que poderíamos
colocar no desenvolvimento do mesmo. Porém, devido a falta de dedicação e interesse de alguns membros - na verdade, de todos nós (eu inclusive) - não
entregamos uma atividade com uma qualidade descente.

Do mais, foi divertido ter estudado essa matéria e ter aplicado os conhecimentos aprendidos durante esse semestre neste projeto. Acredito que com isso eu tenha
aprendido bastante coisa. Uma delas: não fazer trabalho com quem não empenha-se com suma dedicação no desenvolvimento de atividades acadêmicas e faz excessivo uso
de Inteligência Artificial para que suas demandas sejam entregues, desprezando a qualidade de suas atividades e o seu aprendizado.


*/