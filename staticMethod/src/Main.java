public class Main {
    public static void main(String[] args) {
        Course maths = new Course("Matematik", "mat", 70);
        Course physics = new Course("Fizik", "fiz", 20);
        Course chemistry = new Course("Kimya", "kim", 100);

        //int[] grades = {maths.grade, physics.grade, chemistry.grade};
        //maths.calculateAverage(grades);

        //Calculate calc = new Calculate();
        //calc.calculateAverage(grades);

        //Calculate.calculateAverage(grades); //static

        Course[] courses = {maths, physics, chemistry};

        Calculate.calculateAverage(courses); //static
    }


    // Static variables / methods : object'lere ait olmaktan çıkıp, class'lara ait olurlar.
    // class'tan bir instance üretilmeden kullanılırlar.
    // Bir class'tan herhangi bir nesne üretmeden class içerisindeki variables ve methods'a erişme imkânı sağlar
    // Aynı zamanda static bir variable bir kere bellekte oluşturulur ve referansı alınamaz.
    // stativ variable'a erişim class adıyla olur.
    // static variable, class'ın tüm instance variables'ları tarafından kullanılmaya uygundur.
    // static method içerisinde static olmayan variable ve method'a erişemeyiz.
    // ilgili class'ın instance variables'ına dokunmadan yapacağımız bir işlem varsa static olarak tanımlayabiliriz.
    // static methods sadece bulunduğu class'a bağlıdır, class'ın instance variables'ına değil!!





}