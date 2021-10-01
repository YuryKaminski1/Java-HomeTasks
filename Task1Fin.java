public class Task1Fin {

    public static void main(String[] args) {

        int a;
        int p;
        double m1;
        double m2;
        double g;

        a = Integer.parseInt(args[0]);
        p = Integer.parseInt(args[1]);
        m1 = Double.parseDouble(args[2]);
        m2 = Double.parseDouble(args[3]);

        g = 4 * Math.pow(Math.PI, 2) * (Math.pow(a, 3) / (Math.pow(p, 2) * (m1 + m2)));
        System.out.println("Answer: G = " + g);

    }

}
