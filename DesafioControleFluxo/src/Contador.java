import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Primeiro Parâmetro");
        int parametroUm = scanner.nextInt();

        System.out.print("Digite o Segundo Parâmetro");
        int parametroDois = scanner.nextInt();
        
        scanner.close(); //Fecha o Scanner, caso contrário, se não estivesse fechado, o código não funcionaria

        try{
            Contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e){ // ajustar o catch;
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void Contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if(parametroUm > parametroDois){
            //tratar com a exception;
            throw new ParametrosInvalidosException();

        } else {
            for(int i = parametroUm; i < parametroDois; i ++){
                System.out.println("Imprimindo o número : " + i);
            }
        }
    }
}
