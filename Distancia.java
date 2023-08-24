import java.lang.Math;

class Distancia {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int x2 = Integer.parseInt(args[1]);
        int y1 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        System.out.printf("Distância = %.4f\n", Math.sqrt((x2-x1) + y2 -y1));
    }
}
