public class Two_D_Arrays {
    public static void main(String[] args) {
        String[][] cars = {{"swift ", "Maruti ", "Renault "},
                           {"lambo ", "RangeRover ","santro"}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cars[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
