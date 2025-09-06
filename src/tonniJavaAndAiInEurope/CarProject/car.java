package tonniJavaAndAiInEurope.CarProject;

public class car {
    // O carro deve começar desligado
    private boolean isOn = false;
    private int speed = 0;
    private int fuel = 100; // Combustível inicial  
    
    // Ligar o carro
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Se o carro estiver desligado, não pode fazer nada
    public void accelerate() {
        if (isOn) {
            speed += 10;
            fuel -= 5;
            System.out.println("Acelerando. Velocidade: " + speed + " km/h. Combustível: " + fuel + "%.");
        } else {
            System.out.println("O carro está desligado. Ligue o carro primeiro.");
        }

    }
    // quando o carro for acelerado, ele deve incrementar a velocidade em 1 km/h
    public void brake() {
        if (isOn) {
            if (speed > 0) {
                speed -= 10;
                System.out.println("Freando. Velocidade: " + speed + " km/h.");
            } else {
                System.out.println("O carro já está parado.");
            }
        } else {
            System.out.println("O carro está desligado. Ligue o carro primeiro.");
        }
    }
    // quando o carro for freado, ele deve decrementar a velocidade em 1 km/h
    public void refuel() {
        if (fuel < 100) {
            fuel = 100;
            System.out.println("Carro reabastecido. Combustível: " + fuel + "%.");
        } else {
            System.out.println("O tanque já está cheio.");
        }
    }

    // O carro deve ter 6 marchas, não deve ser permitido pular nenhuma marcha
    public void changeGear(int gear) {
        if (isOn) {
            if (gear >= 1 && gear <= 6) {
                System.out.println("Mudando para a marcha " + gear + ".");
            } else {
                System.out.println("Marcha inválida. O carro tem marchas de 1 a 6.");
            }
        } else {
            System.out.println("O carro está desligado. Ligue o carro primeiro.");
        }
    }
    // A velocidade do carro deve respeitar os seguintes limites para cada marcha:
    // se o carro estiver na marcha 0 (neutro), a velocidade deve ser 0 km/h
    // se o carro estiver na marcha 1, a velocidade deve ser entre 0 e 20 km/h
    // se o carro estiver na marcha 2, a velocidade deve ser entre 20 e 40 km/h
    // se o carro estiver na marcha 3, a velocidade deve ser entre 40 e 60 km/h
    // se o carro estiver na marcha 4, a velocidade deve ser entre 60 e 80 km/h
    // se o carro estiver na marcha 5, a velocidade deve ser entre 80 e 100 km/h
    // se o carro estiver na marcha 6, a velocidade deve ser entre 100 e 120 km/h
    
    
    // Getters para obter o estado atual do carro
    

    public int getSpeed() {
        return speed;
    }
    public int getFuel() {
        return fuel;
    }
    public boolean isOn() {
        return isOn;
    }
    public void turnOff() {
        if (isOn) {
            isOn = false;
            speed = 0;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }


}
