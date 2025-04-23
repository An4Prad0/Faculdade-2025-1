package principalveiculo;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private boolean motorLigado = false;
    private double combustivel = 50;

    public void ligarMotor() {
        if (this.motorLigado) {
            System.out.println("O motor já está ligado");
        } else {
            this.motorLigado = true;
            System.out.println("Motor ligado");
        }
    }

    public void desligarMotor() {

        if (this.motorLigado) {
            this.motorLigado = false;
            System.out.println("Motor desligado");
        } else {
            System.out.println("O motor já está desligado");
        }
    }

    public void acelerar() {
        if (this.motorLigado) {
            if (this.combustivel <= 0) {
                System.out.println("Acabou o combustivel");
            } else {
                this.velocidadeAtual = this.velocidadeAtual + 10;
                this.combustivel = this.combustivel - 0.5;
                System.out.println("A velocidade atual é: " + this.velocidadeAtual);
            }
        } else {
            System.out.println("O motor não está ligado");
        }
    }

    public void frear() {
        if (this.velocidadeAtual > 0) {
            this.velocidadeAtual -= 10;
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0;
            }
            System.out.println("Velocidade atual é:" + this.velocidadeAtual);
        } else {
            System.out.println("O veículo já está parado");
        }
    }

    public void exibirInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        if (this.motorLigado) {
            System.out.println("Motor Ligado");
        } else {
            System.out.println("Motor desligado");
        }
        System.out.println("Velocidade Atual km/h: " + this.velocidadeAtual);
        System.out.println("Quantidade de combutivel: " + this.combustivel);
    }
}
