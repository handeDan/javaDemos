class Outer {
    /* public void run()
    {
       System.out.println("Dıştaki sınıfın metodu çalıştı.");
        Inner inner = new Inner();
        inner.run();
            }*/
static class Inner {
    //İçteki sınıflar static yapılabildiği gibi,
    //sınıfa dışarıdan bir erişim sağlanmasının önüne geçmek için
    // private ve protected erişim belirleyicileri de kullanılabilir.(private class inner {...} gibi
    public void run() {
        System.out.println("İçteki sınıfın metodu çalıştı");
    }
        }
    }
