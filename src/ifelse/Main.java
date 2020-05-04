package ifelse;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        LogicalOp op = new LogicalOp();
        Nume FastTRackIT = new Nume();
        int biggest = op.checkBiggerNumber(5,9);
        System.out.println("Suma este: " +calc.adunare(3,4));
        System.out.println("Diferenta este: " +calc.scadere(3,4));
        System.out.println("Produsul este: " +calc.inmultire(3,4));
        System.out.println("Catul este: " +calc.impartire(8,4));
        System.out.println("Numarul mai mare este : "+biggest);
        System.out. println("comparare nume: "+FastTRackIT.name("fasttrackit"));
        System.out.println("Afisare text si numar  " +FastTRackIT.masina(5 , "FastTrackIT"));
        System.out.println("Afisare text si numar  " +FastTRackIT.masina(2 , "FastTrackIT"));
        System.out.println("Afisare text si numar zapada " +FastTRackIT.zapada(2 ));
        System.out.println("Afisare text si numar zapada " +FastTRackIT.zapada(10 ));
        System.out.println("Afisare nr " +FastTRackIT.numere(5 ));
        System.out.println("Afisare nr " +FastTRackIT.numere(4 ));
        System.out.println("Afisare nr " +FastTRackIT.numere(2 ));
        FastTRackIT.swcase(4);
        System.out.println("Numarul este: " + FastTRackIT.adev(6));
        System.out.println("Drept de vot: " + FastTRackIT.vot(44));
        System.out.println("Numarul mai mare este: " + FastTRackIT.bignumber(5 , 8, 1));
        op.osutanumere(90);
        op.negativnumar(-90);
        op.numaratoare(5 , 15);
        op.numaratoare_crescatoare(6, 3);
        op.numerepare();
        op.numereimpare();
        op.adunarenumere();
        op.mediediv7(15,2);


    }


}

