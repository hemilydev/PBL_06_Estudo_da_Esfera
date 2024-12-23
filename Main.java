import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double diamEsfera, raio, perimetro, areaSuperficie, volumeEsfera;
        double arcoAngulo, comprimentoArco, areaCircular;
        double areaInscrito, lado, semiperimetro, areaCircunscrito;

        System.out.print("Digite o diâmetro da esfera: ");
        diamEsfera = ler.nextDouble();
        raio = diamEsfera / 2;
        perimetro = Math.PI * diamEsfera;
        areaSuperficie = (4 * Math.PI) * Math.pow(raio, 2);
        volumeEsfera = ((4 * Math.PI) * Math.pow(raio, 3) / 3);

        System.out.print("Digite o ângulo do arco em grau: ");
        arcoAngulo = ler.nextDouble();
        comprimentoArco = (arcoAngulo / 360) * (2 * Math.PI * raio);
        areaCircular = (arcoAngulo / 360) * areaSuperficie;

        areaInscrito = 0.5 * Math.pow(raio, 2);
        lado = diamEsfera;
        semiperimetro = (3 * lado) / 2;
        areaCircunscrito = Math.sqrt(semiperimetro * Math.pow(semiperimetro - lado, 3));

        System.out.println();
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + areaSuperficie);
        System.out.println("Volume: " + volumeEsfera);
        System.out.println("Comprimento do arco: " + comprimentoArco);
        System.out.println("Área do setor circular: " + areaCircular);
        System.out.println("Área do triângulo inscrito: " + areaInscrito);
        System.out.println("Área do triângulo circunscrito: " + areaCircunscrito);
    }
}
