package MainPackage;

public final class Equations {

    /**
     * Calculates roots of a square equations by 3 coefficients
     * @param coefficients all three coefficients
     * @return two possible roots
     * @throws RuntimeException number of coefficients is not valid
     * @throws RuntimeException there cannot be found a real root
     */
    public static double[] FindRoots(int[] coefficients) throws RuntimeException {
        if (coefficients.length != 3)
            throw new RuntimeException("Inappropriate number of coefficients");

        int d = coefficients[1]*coefficients[1] - 4*coefficients[0]*coefficients[2];

        if (d < 0)
            throw new RuntimeException("No real root exists");

        return new double[] {
                (-coefficients[1] - Math.sqrt(d))/2,
                (-coefficients[1] + Math.sqrt(d))/2
        };
    }


}
