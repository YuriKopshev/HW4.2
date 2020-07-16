public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double index = bmiService.calculate(90,1.8);
        System.out.println(index);
    }
}
//Примечание: weight(вес) вводить в килограммах, height(рост) в метрах, то есть 180см = 1,8 метра.