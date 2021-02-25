class Degree extends Operation {
    @Override
    public double execute(int firstoperand, int secondoperand) {
        double result = 1;
        for (int i = 1; i <= secondoperand; i++) {
            result = result * firstoperand;
        }
        return result;
    }
}