
public class Application {

    public static void main(String[] args){
        drawSqr(10,25);
    }
    private static void drawSqr(int a, int b){
        String[][]sqr = new String[a][b];
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                sqr[i][0] = "|";
                sqr[a-1][j] = "-";
                sqr[0][j] = "-";
                sqr[i][b-1] = "|";
            }
        }
        for (int i = 1; i< a-1; i++){
            for (int j=1; j< b-1; j++){
                sqr[i][j] = " ";
            }
        }
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                System.out.print(sqr[i][j]);
            }
            System.out.println();
        }
    }
}
