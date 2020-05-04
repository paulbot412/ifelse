package ifelse;

public class LogicalOp {
    int checkBiggerNumber(int a, int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }

    }
    public void osutanumere(int a){
        int i=a;
        do {
            System.out.println(i);
            i++;
        }while (i<=100);

    }
    public void negativnumar(int a){
        int i=a;
        do {
            System.out.println(i);
            i--;
        }while (i>=-100);

    }
    public void numaratoare(int a, int b){
        int i=a;
        do {
            System.out.println(i);
            i++;
        }while (i<=b);

    }
    public void numaratoare_crescatoare(int a, int b){
        if(a<b) {
            int i = a;
            do {
                System.out.println(i);
                i++;
            } while (i <= b);
        }
        else {
            int i=b;
            do {
                System.out.println(i);
                i++;
            } while (i <= a);
        }

    }
    public void numerepare(){
        int i=0;
        do {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i<=100);
    }
    public void numereimpare(){
        int i=0;
        do{
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }while (i<=100);
    }

    public void adunarenumere(){
        int rez=0;
        float medie;
        int i=111;
        int j=1;
        do{
            int rezint=rez;
            rez =rezint+j;
            j++;

        }while (j<=8899);
        medie=rez/(8899-111);
        System.out.println("rezultat adunare: "+rez);
        System.out.println("rezultat medie: " +medie);
    }
    public void mediediv7(int a, int b){
        float medie;
        int sum=0;
        int x=0;

        int k=0;
        if(a>b){
            a=x;
            a=b;
            b=x;
            int j=a;
            do {
                if(a % 7 == 0){
                    int rezint=sum;
                    sum =rezint+j;
                    k++;

                }
                j++;

            }while(j<=b);
            medie=sum;
            System.out.println("Media cifrelor mod 7 este: "+sum);

        }
        else {
            int j=a;
            do {
                if(a % 7 == 0){
                    int rezint=sum;
                    sum =rezint+k;
                    k++;
                }

                j++;
            }while(j<=b);
            medie=sum/k;
            System.out.println("Media cifrelor mod 7 este: "+medie);
        }

    }
}



