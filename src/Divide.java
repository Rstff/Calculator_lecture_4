class Divide extends Operation {
    @Override
    public double execute(int firstoperand, int secondoperand) {
        return (double) firstoperand / (double) secondoperand;
    }
}