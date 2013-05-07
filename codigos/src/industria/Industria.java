/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package industria;

import java.util.Scanner;

/*Implementar um sistema de produção para uma indústria têxtil. O sistema deve permitir o 
 *recorte de formas geométricas sobre uma superfície retangular. O retângulo é formado por um material 
 *que apresenta valor por metro quadrado e nome. O usuário informa os dados do material e as coordenadas e 
 *dimensões de figuras geométricas. A primeira versão do sistema utiliza apenas quadrados e círculos. 
 *As figuras serão recortadas sobre o material por uma máquina. O sistema deve apresentar o total de 
 *retalhos (sobra de material) em metros quadrados e em percentual da área total. 
 *A máquina de corte funciona apenas sobre retângulos.
 * */
public class Industria {

    public static void main(String[] args) throws Exception {

        boolean posso = true;

        Scanner ler = new Scanner(System.in);
        int contador = 0;
        Figura formas[];
        formas = new Figura[10];
        double largura = 0;
        double altura = 0;
        int op = 0;
        System.out.println("Informe a Altura da folha: ");
        altura = ler.nextDouble();
        System.out.println("Informe a Largura da folha: ");
        largura = ler.nextDouble();
        boolean sair = false;

        Retangulo folha = new Retangulo(altura, largura);
        while (contador < 10 && sair == false) {
        System.out.println("Informe a forma que deseja recortar");
        System.out.println("1 - Circulo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Sair");
        
        op = ler.nextInt();
        
            switch (op) {
                case 1: {
                    double raio = 0;
                    double X;
                    double Y;
                    System.out.println("Informe As coordenadas X/Y do Circulo: ");
                    X = ler.nextDouble();
                    Y = ler.nextDouble();
                    Ponto pt = new Ponto(X, Y);
                    System.out.println("Informe e o Raio do Circulo: ");
                    raio = ler.nextDouble();
                    formas[contador] = new Circulo(pt, raio);
                    posso = folha.testaFolha(formas, contador);
                    if (posso) {
                        System.out.println("Posso botar um " + formas.getClass());
                        contador++;
                        
                    } else {
                        System.out.println("Não Posso botar um " + formas.getClass());
                        
                    }

                    break;
                }
                case 2: {
                    double X;
                    double Y;
                    System.out.println("Informe As coordenadas X/Y do Quadrado: ");
                    X = ler.nextDouble();
                    Y = ler.nextDouble();
                    Ponto pt = new Ponto(X, Y);
                    double lado = 0;
                    System.out.println("Informe e o Lado do Quadrado: ");
                    lado = ler.nextDouble();
                    formas[contador] = new Quadrado(pt, lado);
                    posso = folha.testaFolha(formas, contador);
                    if (posso) {
                        System.out.println("Posso botar um " + formas.getClass());
                        contador++;
                    } else {
                        System.out.println("Não Posso botar um " + formas.getClass());
                    }
                    break;
                }
                case 3:
                {
                    sair = true;
                    break;
                }
            }






        }

    }
}
