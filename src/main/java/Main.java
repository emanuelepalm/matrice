public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        System.out.println("Verticale");
        for(int i = 0; i < array.length; i++) {
            System.out.println();
            for(int j = 0; j < array[i].length; j++ ) {
                array[i][j] = (j+1)*(i+1);
                System.out.println("[" + (i+1) + "][" + (j+1) + "] => " + array[i][j]);
            }
        }

        System.out.println(System.lineSeparator() + "Orizzontale");
        for(int i = 0; i < array.length; i++) {
            System.out.println();
            for(int j = 0; j < array[0].length; j++ ) {
                if((array[i][j])>=10) {
                    System.out.print("|" + (array[i][j]) + "|");
                }else {
                    System.out.print("|" + (array[i][j]) + " |");
                }
            }
        }


    }
}