public class Multiply {
    private int chislitel;
    private int znamenatel;

    public Multiply(int chislitel, int znamenatel){
        this.chislitel = chislitel;
        this.znamenatel = znamenatel;
    }

    public Multiply multiply(Multiply second) {
        int newChislitel = this.chislitel * second.chislitel;
        int newZnamenatel = this.znamenatel * second.znamenatel;
        return new Multiply(newChislitel, newZnamenatel).reduce();
    }

    public Multiply reduce() {
        int gcd = findGCD(this.chislitel, this.znamenatel);
        return new Multiply(this.chislitel / gcd, this.znamenatel / gcd);
    }

    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public int getChislitel() {
        return chislitel;
    }

    public int getZnamenatel() {
        return znamenatel;
    }

    public String toString() {
        return chislitel + "/" + znamenatel;
    }
}