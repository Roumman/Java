interface Printable {
    void print(String doc);
}

interface Scannable {
    void scan(String doc);
}

class SimplePrinter implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}

class AllInOne implements Printable, Scannable {
    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }

    @Override
    public void scan(String doc) {
        System.out.println("Scanning: " + doc);
    }
}
