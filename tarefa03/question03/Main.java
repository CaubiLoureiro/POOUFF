package tarefa03.question03;

public class Main {
    public static void main(String[] args){
        Data data1 = new Data(10,3,2020);
        Data data2 = new Data(1,6,2021);
        Data data3 = new Data("Agosto",8,2020);
        Data data4 = new Data("Março",3,2020);
        Data data5 = new Data(365, 2020);
        Data data6 = new Data(366,2024);

        data1.printData();
        data2.printData();
        data3.printData();
        data4.printData();
        data5.printData();
        data6.printData();
    }
}
