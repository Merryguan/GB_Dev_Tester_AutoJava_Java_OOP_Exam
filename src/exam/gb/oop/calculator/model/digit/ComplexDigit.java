package exam.gb.oop.calculator.model.digit;

public class ComplexDigit extends RealDigit {

    protected int imagine;

    public ComplexDigit(int real, int imagine) {

        super(real);
        this.imagine = imagine;

    }

    public int getImagine() {

        return imagine;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(real).append(imagine > 0 ? "+i" : "-i")
                .append(imagine > 0 ? imagine : -imagine);
        return sb.toString();

    }
}
