import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("--------- PROCESSO SELETIVO ---------");
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "LARA", "BERNARDO", "ENILDA", "JADER", "SILVIA", "RONALDO", "DIONATAS", "GABRIEL"};

        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatoSelecionado < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O(a) candidato(a) " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O(a) candidato(a) " + candidato + " foi selecionado(a) para a vaga");
                candidatoAtual++;
            }
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) System.out.println("Ligar para o(a) candidato(a)");
        else  if(salarioBase == salarioPretendido) System.out.println("Ligar para o(a) candidato(a) com contra proposta");
        else System.out.println("Aguardando o resultado dos demais candidatos");
    }
}