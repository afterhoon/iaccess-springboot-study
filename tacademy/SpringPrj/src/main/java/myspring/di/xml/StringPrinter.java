package myspring.di.xml;

public class StringPrinter implements Printer {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void print(String msg) {
        this.buffer.append(msg);
    }

    public String toString() {
        return this.buffer.toString();
    }
}
