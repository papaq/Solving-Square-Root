package MainPackage;

public class Main {

    public static void main(String[] args) {

        int[] equationCoefficients = new int[args.length];

        double roots[] = null;

        try {
            for (int i = 0; i < args.length; i++) {
                equationCoefficients[i] = Integer.parseInt(args[i]);
            }

            roots = Equations.FindRoots(equationCoefficients);
        }
        catch (RuntimeException e) {
            System.out.println("Argument(s) is invalid: " + e.getMessage());
            System.exit(0);
        }

        if (roots != null)
        {
            if (roots[0] == roots[1])
                System.out.format("Single root is: %.3f", roots[0]);
            else
                System.out.format("Roots are: %.3f and %.3f", roots[0], roots[1]);
        }

    }
}
